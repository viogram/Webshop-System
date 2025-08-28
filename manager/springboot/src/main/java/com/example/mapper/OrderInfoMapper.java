package com.example.mapper;

import com.example.entity.OrderInfo;

import java.util.List;

/**
 * 操作orderInfo相关数据接口
*/
public interface OrderInfoMapper {

    /**
      * 新增
    */
    int insert(OrderInfo orderInfo);

    /**
      * 删除
    */
    int deleteById(Integer id);

    /**
      * 修改
    */
    int updateById(OrderInfo orderInfo);

    /**
      * 根据ID查询
    */
    OrderInfo selectById(Integer id);

    /**
      * 查询所有
    */
    List<OrderInfo> selectAll(OrderInfo orderInfo);

}