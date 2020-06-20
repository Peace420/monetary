package org.rrd.market.mapper;

<<<<<<< HEAD
=======
import org.apache.ibatis.annotations.Mapper;
import org.rrd.system.pojo.Product;

import java.util.List;

>>>>>>> 95524300c850d0489ab95f470a767bcd966b17d2
/**
 * Description: MarketMapper
 * date: 2020/5/19 14:33
 * author:
 * version: 1.0
 */
<<<<<<< HEAD
public interface MarketMapper {
=======
@Mapper
public interface MarketMapper {

    List<Product> uplan();

    List<Product> allProduct();
>>>>>>> 95524300c850d0489ab95f470a767bcd966b17d2
}
