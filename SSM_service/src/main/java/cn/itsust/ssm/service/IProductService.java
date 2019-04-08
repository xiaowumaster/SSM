package cn.itsust.ssm.service;

import cn.itsust.ssm.Product;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-07  16:26
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;

    public void save(Product product);

}
