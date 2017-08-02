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
 * sku收藏
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@TableName("sku_collection")
public class SkuCollection extends Model<SkuCollection> {

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
		return "SkuCollection{" +
			"id=" + id +
			", userId=" + userId +
			", skuId=" + skuId +
			", addTime=" + addTime +
			", productId=" + productId +
			", shopId=" + shopId +
			"}";
	}
}
