package com.tw.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 供应商
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
public class Supplier extends Model<Supplier> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 名称
     */
	private String name;
    /**
     * logo
     */
	private String logo;
    /**
     * keywords
     */
	private String keywords;
    /**
     * 描述
     */
	private String desc;
    /**
     * 链接
     */
	private String url;
    /**
     * 排序
     */
	private Integer sequence;
    /**
     * 默认状态为0，0：正常；1：禁用
     */
	private Integer state;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
		return "Supplier{" +
			"id=" + id +
			", name=" + name +
			", logo=" + logo +
			", keywords=" + keywords +
			", desc=" + desc +
			", url=" + url +
			", sequence=" + sequence +
			", state=" + state +
			", shopId=" + shopId +
			"}";
	}
}
