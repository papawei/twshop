package com.tw.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 										
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品
     */
	private Integer id;
    /**
     * 商品名称
     */
	@TableField("product_name")
	private String productName;
    /**
     * 商品描述
     */
	private String description;
    /**
     * 商品类目
     */
	@TableField("category_id")
	private Integer categoryId;
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
	private Integer state;
    /**
     * 创建时间
     */
	@TableField("add_time")
	private Date addTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getPsn() {
		return psn;
	}

	public void setPsn(String psn) {
		this.psn = psn;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
		return "Product{" +
			"id=" + id +
			", productName=" + productName +
			", description=" + description +
			", categoryId=" + categoryId +
			", psn=" + psn +
			", sequence=" + sequence +
			", state=" + state +
			", addTime=" + addTime +
			", updateTime=" + updateTime +
			", shopId=" + shopId +
			"}";
	}
}
