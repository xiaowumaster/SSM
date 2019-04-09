package cn.itsust.ssm.dao;

import cn.itsust.ssm.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-09  10:14
 */
public interface UserDao {

    @Select("select * from users where username = #{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles", column = "id",javaType = java.util.List.class,many = @Many(select = "cn.itsust.ssm.dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findByUsername(String username) throws Exception;

    @Select("select * from users")
    public List<UserInfo> findAll();

    @Insert("insert into user(email,username,password,phoneNum,status) value(#{email}," +
            "#{username},#{password},#{phoneNum},#{status})")
    public void save(UserInfo userInfo) throws Exception;
}
