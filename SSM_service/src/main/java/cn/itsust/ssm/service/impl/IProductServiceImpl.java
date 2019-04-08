package cn.itsust.ssm.service.impl;

import cn.itsust.ssm.Product;
import cn.itsust.ssm.dao.IProductDao;
import cn.itsust.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-07  16:34
 */
@Service
@Transactional
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao iProductDao;

    @Override
    public List<Product> findAll() throws Exception {
        return iProductDao.finAll();
    }

    @Override
    public void save(Product product) {
        iProductDao.save(product);
    }
}
