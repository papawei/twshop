package com.tw.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@TableName("sku_image")
public class SkuImage extends Model<SkuImage> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	@TableField("sku_id")
	private Integer skuId;
	private String src;
    /**
     * product_id
     */
	@TableField("product_id")
	private Integer productId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SkuImage{" +
			"id=" + id +
			", skuId=" + skuId +
			", src=" + src +
			", productId=" + productId +
			"}";
	}
}
