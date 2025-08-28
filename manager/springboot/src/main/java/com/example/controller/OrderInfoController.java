package com.example.controller;

import com.example.common.Result;
import com.example.entity.OrderInfo;
import com.example.service.OrderInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公告信息表前端操作接口
 **/
@RestController
@RequestMapping("/orderInfo")
public class OrderInfoController {

    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 新增
     */
    @PostMapping("/add")
    public Result add(@RequestBody OrderInfo orderInfo) {
        orderInfoService.add(orderInfo);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id) {
        orderInfoService.deleteById(id);
        return Result.success();
    }

    /**
     * 批量删除
     */
    @DeleteMapping("/delete/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        orderInfoService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result updateById(@RequestBody OrderInfo orderInfo) {
        orderInfoService.updateById(orderInfo);
        return Result.success();
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        OrderInfo orderInfo = orderInfoService.selectById(id);
        return Result.success(orderInfo);
    }

    /**
     * 查询所有
     */
    @GetMapping("/selectAll")
    public Result selectAll(OrderInfo orderInfo ) {
        List<OrderInfo> list = orderInfoService.selectAll(orderInfo);
        return Result.success(list);
    }

    /**
     * 分页查询
     */
    @GetMapping("/selectPage")
    public Result selectPage(OrderInfo orderInfo,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<OrderInfo> page = orderInfoService.selectPage(orderInfo, pageNum, pageSize);
        return Result.success(page);
    }

}