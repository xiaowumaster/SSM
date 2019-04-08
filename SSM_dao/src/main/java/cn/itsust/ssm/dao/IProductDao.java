package cn.itsust.ssm.dao;

import cn.itsust.ssm.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-07  16:23
 */
public interface IProductDao {

    @Select("select * from product where id = #{id}")
    public Product findById(String id) throws Exception;

    @Select("select * from product")
    public List<Product> finAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName}," +
            "#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void save(Product product);
}
