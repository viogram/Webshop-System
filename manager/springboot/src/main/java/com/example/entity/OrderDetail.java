package com.example.entity;

import java.io.Serializable;

/**
 * 订单明细表
*/
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    private Integer oId;
    private Integer pId;
    private Integer num;
    private String goodsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getOId() {
        return oId;
    }
    public void setOId(Integer oId) {
        this.oId = oId;
    }
    public Integer getPId() {
        return pId;
    }
    public void setPId(Integer pId) {
        this.pId = pId;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }
    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}