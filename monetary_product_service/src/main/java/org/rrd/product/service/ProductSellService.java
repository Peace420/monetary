package org.rrd.product.service;

import org.rrd.product.mapper.ProductSellMapper;
import org.rrd.system.pojo.Product;
import org.rrd.system.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hujie
 */
public interface ProductSellService {
    void sell(User user);
}
