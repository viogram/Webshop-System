package com.example.service;

import cn.hutool.core.date.DateUtil;
import com.example.entity.Account;
import com.example.entity.OrderInfo;
import com.example.mapper.OrderInfoMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公告信息表业务处理
 **/
@Service
public class OrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    /**
     * 新增
     */
    public void add(OrderInfo orderInfo) {
        orderInfo.setTime(DateUtil.today());
        orderInfoMapper.insert(orderInfo);
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        orderInfoMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            orderInfoMapper.deleteById(id);
        }
    }

    /**
     * 修改
     */
    public void updateById(OrderInfo orderInfo) {
        orderInfoMapper.updateById(orderInfo);
    }

    /**
     * 根据ID查询
     */
    public OrderInfo selectById(Integer id) {
        return orderInfoMapper.selectById(id);
    }

    /**
     * 查询所有
     */
    public List<OrderInfo> selectAll(OrderInfo orderInfo) {
        return orderInfoMapper.selectAll(orderInfo);
    }

    /**
     * 分页查询
     */
    public PageInfo<OrderInfo> selectPage(OrderInfo orderInfo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrderInfo> list = orderInfoMapper.selectAll(orderInfo);
        return PageInfo.of(list);
    }

}