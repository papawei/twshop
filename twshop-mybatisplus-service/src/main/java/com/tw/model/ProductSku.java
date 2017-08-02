package com.tw.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * sku
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@TableName("product_sku")
public class ProductSku extends Model<ProductSku> {

    private static final long serialVersionUID = 1L;

    /**
     * skuid
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String sku1;
	private String sku2;
    /**
     * 默认状态为0，0：正常；1：已下架；2:已删除
     */
	private Integer state;
    /**
     * 库存数量
     */
	@TableField("stock_count")
	private Integer stockCount;
    /**
     * 销售数量
     */
	@TableField("sale_count")
	private Integer saleCount;
    /**
     * 成本价
     */
	@TableField("cost_price")
	private BigDecimal costPrice;
    /**
     * 市场价
     */
	@TableField("market_price")
	private BigDecimal marketPrice;
    /**
     * 评价数量
     */
	@TableField("review_count")
	private String reviewCount;
    /**
     * 访问数量
     */
	@TableField("visit_count")
	private Integer visitCount;
    /**
     * 显示图片主图
     */
	@TableField("show_image")
	private String showImage;
    /**
     * 促销价
     */
	@TableField("promotion_price")
	private BigDecimal promotionPrice;
    /**
     * 是否显示价格
     */
	@TableField("show_price")
	private Integer showPrice;
    /**
     * 是否为精品
     */
	@TableField("is_best")
	private Integer isBest;
    /**
     * 是否为热销
     */
	@TableField("is_hot")
	private Integer isHot;
    /**
     * 是否为新品
     */
	@TableField("is_new")
	private Integer isNew;
    /**
     * 是否促销
     */
	@TableField("is_promotion")
	private Integer isPromotion;
	@TableField("add_time")
	private Date addTime;
	@TableField("update_time")
	private Date updateTime;
    /**
     * 排序
     */
	private Integer sequence;
    /**
     * sku编码
     */
	@TableField("sku_sn")
	private String skuSn;
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

	public String getSku1() {
		return sku1;
	}

	public void setSku1(String sku1) {
		this.sku1 = sku1;
	}

	public String getSku2() {
		return sku2;
	}

	public void setSku2(String sku2) {
		this.sku2 = sku2;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getStockCount() {
		return stockCount;
	}

	public void setStockCount(Integer stockCount) {
		this.stockCount = stockCount;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
	}

	public Integer getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(Integer visitCount) {
		this.visitCount = visitCount;
	}

	public String getShowImage() {
		return showImage;
	}

	public void setShowImage(String showImage) {
		this.showImage = showImage;
	}

	public BigDecimal getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(BigDecimal promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Integer getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(Integer showPrice) {
		this.showPrice = showPrice;
	}

	public Integer getIsBest() {
		return isBest;
	}

	public void setIsBest(Integer isBest) {
		this.isBest = isBest;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsPromotion() {
		return isPromotion;
	}

	public void setIsPromotion(Integer isPromotion) {
		this.isPromotion = isPromotion;
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

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getSkuSn() {
		return skuSn;
	}

	public void setSkuSn(String skuSn) {
		this.skuSn = skuSn;
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
		return "ProductSku{" +
			"id=" + id +
			", sku1=" + sku1 +
			", sku2=" + sku2 +
			", state=" + state +
			", stockCount=" + stockCount +
			", saleCount=" + saleCount +
			", costPrice=" + costPrice +
			", marketPrice=" + marketPrice +
			", reviewCount=" + reviewCount +
			", visitCount=" + visitCount +
			", showImage=" + showImage +
			", promotionPrice=" + promotionPrice +
			", showPrice=" + showPrice +
			", isBest=" + isBest +
			", isHot=" + isHot +
			", isNew=" + isNew +
			", isPromotion=" + isPromotion +
			", addTime=" + addTime +
			", updateTime=" + updateTime +
			", sequence=" + sequence +
			", skuSn=" + skuSn +
			", productId=" + productId +
			", shopId=" + shopId +
			"}";
	}
}
