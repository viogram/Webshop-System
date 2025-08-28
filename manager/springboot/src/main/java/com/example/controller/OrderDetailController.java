package com.example.controller;

import com.example.common.Result;
import com.example.entity.OrderDetail;
import com.example.service.OrderDetailService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公告信息表前端操作接口
 **/
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Resource
    private OrderDetailService orderDetailService;

    /**
     * 新增
     */
    @PostMapping("/add")
    public Result add(@RequestBody OrderDetail orderDetail) {
        orderDetailService.add(orderDetail);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        orderDetailService.deleteById(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        orderDetailService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result updateById(@RequestBody OrderDetail orderDetail) {
        orderDetailService.updateById(orderDetail);
        return Result.success();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        OrderDetail orderDetail = orderDetailService.selectById(id);
        return Result.success(orderDetail);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(OrderDetail orderDetail ) {
        List<OrderDetail> list = orderDetailService.selectAll(orderDetail);
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(OrderDetail orderDetail,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<OrderDetail> page = orderDetailService.selectPage(orderDetail, pageNum, pageSize);
        return Result.success(page);
    }

}