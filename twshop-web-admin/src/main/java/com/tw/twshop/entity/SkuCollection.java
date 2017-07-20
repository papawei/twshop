package com.tw.twshop.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sku_collection
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SkuCollection {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_collection.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_collection.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   skuid
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_collection.sku_id
     *
     * @mbg.generated
     */
    private Integer skuId;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_collection.add_time
     *
     * @mbg.generated
     */
    private Date addTime;

    /**
     * Database Column Remarks:
     *   product_id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_collection.product_id
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   店铺
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sku_collection.shop_id
     *
     * @mbg.generated
     */
    private Integer shopId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_collection.id
     *
     * @return the value of sku_collection.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_collection.id
     *
     * @param id the value for sku_collection.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_collection.user_id
     *
     * @return the value of sku_collection.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_collection.user_id
     *
     * @param userId the value for sku_collection.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_collection.sku_id
     *
     * @return the value of sku_collection.sku_id
     *
     * @mbg.generated
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_collection.sku_id
     *
     * @param skuId the value for sku_collection.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_collection.add_time
     *
     * @return the value of sku_collection.add_time
     *
     * @mbg.generated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_collection.add_time
     *
     * @param addTime the value for sku_collection.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_collection.product_id
     *
     * @return the value of sku_collection.product_id
     *
     * @mbg.generated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_collection.product_id
     *
     * @param productId the value for sku_collection.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sku_collection.shop_id
     *
     * @return the value of sku_collection.shop_id
     *
     * @mbg.generated
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sku_collection.shop_id
     *
     * @param shopId the value for sku_collection.shop_id
     *
     * @mbg.generated
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}