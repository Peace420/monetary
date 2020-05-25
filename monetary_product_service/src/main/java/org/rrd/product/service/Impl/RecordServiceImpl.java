package org.rrd.product.service.Impl;

import com.baomidou.mybatisplus.extension.api.R;
import org.rrd.product.mapper.RecordMapper;
import org.rrd.product.service.RecordService;
import org.rrd.system.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hujie
 */
@Service
@Transactional
public class RecordServiceImpl  implements RecordService {

    @Autowired
    private RecordMapper recordMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertRecord(Record record) {
     recordMapper.insert(record);
    }
}
