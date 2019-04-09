package cn.itsust.ssm.service.impl;

import cn.itsust.ssm.Orders;
import cn.itsust.ssm.dao.IOrdersDao;
import cn.itsust.ssm.service.IOrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiaowu
 * @create 2019-04-08  17:25
 */
@Service
@Transactional
public class IOrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao iOrdersDao;
    @Override
    public List<Orders> findAll(int page,int size) throws Exception{
        PageHelper.startPage(page, size);
        return iOrdersDao.finaAll();
    }
}
