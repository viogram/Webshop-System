package com.example.service;

import cn.hutool.core.date.DateUtil;
import com.example.entity.Account;
import com.example.entity.OrderDetail;
import com.example.mapper.OrderDetailMapper;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单明细表业务处理
 **/
@Service
public class OrderDetailService {

    @Resource
    private OrderDetailMapper orderDetailMapper;

    /**
     * 新增
     */
    public void add(OrderDetail orderDetail) {
        orderDetailMapper.insert(orderDetail);
    }

    /**
     * 删除
     */
    public void deleteById(Integer id) {
        orderDetailMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids) {
            orderDetailMapper.deleteById(id);
        }
    }

    /**
     * 修改
     */
    public void updateById(OrderDetail orderDetail) {
        orderDetailMapper.updateById(orderDetail);
    }

    /**
     * 根据ID查询
     */
    public OrderDetail selectById(Integer id) {
        return orderDetailMapper.selectById(id);
    }

    /**
     * 查询所有
     */
    public List<OrderDetail> selectAll(OrderDetail orderDetail) {
        return orderDetailMapper.selectAll(orderDetail);
    }

    /**
     * 分页查询
     */
    public PageInfo<OrderDetail> selectPage(OrderDetail orderDetail, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrderDetail> list = orderDetailMapper.selectAll(orderDetail);
        return PageInfo.of(list);
    }

}