package com.tw.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Product {
    /**
     * 商品
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品类目
     */
    @Column(name = "category_id")
    private Short categoryId;

    /**
     * 商品编码
     */
    private String psn;

    /**
     * 排序
     */
    private Integer sequence;

    /**
     * 默认状态为0，0：正常；1：已下架；2:已删除
     */
    private Byte state;

    /**
     * 创建时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 店铺
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 获取商品
     *
     * @return id - 商品
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置商品
     *
     * @param id 商品
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品描述
     *
     * @return description - 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品描述
     *
     * @param description 商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取商品类目
     *
     * @return category_id - 商品类目
     */
    public Short getCategoryId() {
        return categoryId;
    }

    /**
     * 设置商品类目
     *
     * @param categoryId 商品类目
     */
    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取商品编码
     *
     * @return psn - 商品编码
     */
    public String getPsn() {
        return psn;
    }

    /**
     * 设置商品编码
     *
     * @param psn 商品编码
     */
    public void setPsn(String psn) {
        this.psn = psn;
    }

    /**
     * 获取排序
     *
     * @return sequence - 排序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置排序
     *
     * @param sequence 排序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取默认状态为0，0：正常；1：已下架；2:已删除
     *
     * @return state - 默认状态为0，0：正常；1：已下架；2:已删除
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置默认状态为0，0：正常；1：已下架；2:已删除
     *
     * @param state 默认状态为0，0：正常；1：已下架；2:已删除
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取创建时间
     *
     * @return add_time - 创建时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置创建时间
     *
     * @param addTime 创建时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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