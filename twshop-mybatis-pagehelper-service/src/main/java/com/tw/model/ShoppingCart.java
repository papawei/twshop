package com.tw.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "shopping_cart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * skuid
     */
    @Column(name = "sku_id")
    private Integer skuId;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     *  数量
     */
    private Integer num;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * product_id
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 店铺
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取skuid
     *
     * @return sku_id - skuid
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * 设置skuid
     *
     * @param skuId skuid
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取 数量
     *
     * @return num -  数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置 数量
     *
     * @param num  数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取product_id
     *
     * @return product_id - product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置product_id
     *
     * @param productId product_id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取店铺
     *
     * @return shop_id - 店铺
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置店铺
     *
     * @param shopId 店铺
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}