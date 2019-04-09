package cn.itsust.ssm.service;

import cn.itsust.ssm.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-09  14:52
 */
public interface IUserService extends UserDetailsService {

    public List<UserInfo> findAll() throws Exception;

    public void save(UserInfo userInfo) throws Exception;

}
