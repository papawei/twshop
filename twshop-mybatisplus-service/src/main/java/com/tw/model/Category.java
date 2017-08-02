package com.tw.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
	private Integer id;
    /**
     * 名称
     */
	private String name;
    /**
     * 父级id
     */
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 路径
     */
	private String path;
    /**
     * 排序
     */
	private Integer sequence;
    /**
     * 价格范围，用“|”分隔开
     */
	@TableField("price_range")
	private String priceRange;
    /**
     * 层级
     */
	private Integer layer;
    /**
     * 是否有子级
     */
	@TableField("has_child")
	private Boolean hasChild;
    /**
     * 店铺
     */
	@TableField("shop_id")
	private Integer shopId;
    /**
     * 状态:0 正常 ;1 禁用
     */
	private Integer state;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public Integer getLayer() {
		return layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
	}

	public Boolean isHasChild() {
		return hasChild;
	}

	public void setHasChild(Boolean hasChild) {
		this.hasChild = hasChild;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Category{" +
			"id=" + id +
			", name=" + name +
			", parentId=" + parentId +
			", path=" + path +
			", sequence=" + sequence +
			", priceRange=" + priceRange +
			", layer=" + layer +
			", hasChild=" + hasChild +
			", shopId=" + shopId +
			", state=" + state +
			"}";
	}
}
