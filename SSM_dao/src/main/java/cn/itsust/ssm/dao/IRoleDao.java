package cn.itsust.ssm.dao;

import cn.itsust.ssm.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-09  16:26
 */
public interface IRoleDao {

    @Select("select * from role where id in (select roleId from users_role where userId = #{userId})")
    public List<Role> findRoleByUserId(String userId) throws Exception;


}
