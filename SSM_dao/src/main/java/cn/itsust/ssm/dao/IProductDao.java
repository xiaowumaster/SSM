package cn.itsust.ssm.dao;

import cn.itsust.ssm.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-07  16:23
 */
public interface IProductDao {

    @Select("select * from product")
    public List<Product> finAll() throws Exception;
}
