package com.tw.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 购物车
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@TableName("shopping_cart")
public class ShoppingCart extends Model<ShoppingCart> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户id
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * skuid
     */
	@TableField("sku_id")
	private Integer skuId;
    /**
     * 添加时间
     */
	@TableField("add_time")
	private Date addTime;
    /**
     *  数量
     */
	private Integer num;
	@TableField("update_time")
	private Date updateTime;
    /**
     * product_id
     */
	@TableField("product_id")
	private Integer productId;
    /**
     * 店铺
     */
	@TableField("shop_id")
	private Integer shopId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ShoppingCart{" +
			"id=" + id +
			", userId=" + userId +
			", skuId=" + skuId +
			", addTime=" + addTime +
			", num=" + num +
			", updateTime=" + updateTime +
			", productId=" + productId +
			", shopId=" + shopId +
			"}";
	}
}
