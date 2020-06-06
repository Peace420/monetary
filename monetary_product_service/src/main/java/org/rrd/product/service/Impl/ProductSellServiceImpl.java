package org.rrd.product.service.Impl;

import org.rrd.product.Constonst.ComtosmstEnum;
import org.rrd.product.Util.DataClass;
import org.rrd.product.config.EmailException;
import lombok.extern.slf4j.Slf4j;
import org.rrd.product.fegin.RateService;
import org.rrd.product.mapper.ProductSellMapper;
import org.rrd.product.service.ProductSellService;
import org.rrd.product.service.RecordService;
import org.rrd.system.pojo.Record;
import org.rrd.system.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hujie
 */
@Transactional
@Service
public class ProductSellServiceImpl implements ProductSellService {

    @Autowired
    private ProductSellMapper productSellMapper;

    @Autowired
    private RateService rateService;

    @Autowired
    private RecordService recordService;

    private static final int numbprice=5000;
    private static final int numberMinprice=1000;

    @Value("Numberone.one")
    private String numberone;

    @Value("Numberone.two")
    private String numbertwo;

    @Value("Numberone.three")
    private String numberthree;
    Record record=null;

    /**
     * 开始判断个人账户是否充足
     * @param user
     */
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
    public synchronized void sell(User user){
       //log.info("进入出借阶段 开始流程");
        User user1=productSellMapper.selectById(user.getId());
        Integer numberOut = user.getNumberOut();
        try {
        //判断出借金额是否达到5000 && 步长是否大于1000
        if(numberOut>numbprice&&numberOut>numberMinprice){
            //判断出借金额是否超出可用余额
            if (numberOut>user.getUsableBalance()){
                //添加用户出借记录表
                record.setUserId(user.getId());
                record.setProductDetailsId(user.getProductDetailsId());
                record.setBorrowBalance(user.getNumberOut());
                record.setBorrowDate(DataClass.time());
                record.setRecordStatus(Integer.valueOf(numberone));
                //加入出借记录表
                recordService.insertRecord(record);
                //远程调用利息计算接口  传入用户出借金额
                rateService.uplan(user.getNumberOut());
            }else {
                throw new EmailException("可用金额不足,请充值！");
            }
        }else {
            throw new EmailException("金额未到达最低额度");
        }
    }catch (Exception e){
            e.printStackTrace();
        }
    }
}
