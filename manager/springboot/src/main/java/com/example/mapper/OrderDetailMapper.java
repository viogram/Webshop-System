package com.example.mapper;

import com.example.entity.OrderDetail;

import java.util.List;

/**
 * 操作orderDetail相关数据接口
*/
public interface OrderDetailMapper {

    /**
      * 新增
    */
    int insert(OrderDetail orderDetail);

    /**
      * 删除
    */
    int deleteById(Integer id);

    /**
      * 修改
    */
    int updateById(OrderDetail orderDetail);

    /**
      * 根据ID查询
    */
    OrderDetail selectById(Integer id);

    /**
      * 查询所有
    */
    List<OrderDetail> selectAll(OrderDetail orderDetail);

}