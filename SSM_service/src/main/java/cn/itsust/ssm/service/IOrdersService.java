package cn.itsust.ssm.service;

import cn.itsust.ssm.Orders;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-08  17:24
 */
public interface IOrdersService {

    public List<Orders> findAll(int page,int size) throws Exception;

}
