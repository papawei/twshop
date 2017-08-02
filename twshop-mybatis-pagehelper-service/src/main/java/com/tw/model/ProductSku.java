package com.tw.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "product_sku")
public class ProductSku {
    /**
     * skuid
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String sku1;

    private String sku2;

    /**
     * 默认状态为0，0：正常；1：已下架；2:已删除
     */
    private Byte state;

    /**
     * 库存数量
     */
    @Column(name = "stock_count")
    private Integer stockCount;

    /**
     * 销售数量
     */
    @Column(name = "sale_count")
    private Integer saleCount;

    /**
     * 成本价
     */
    @Column(name = "cost_price")
    private BigDecimal costPrice;

    /**
     * 市场价
     */
    @Column(name = "market_price")
    private BigDecimal marketPrice;

    /**
     * 评价数量
     */
    @Column(name = "review_count")
    private String reviewCount;

    /**
     * 访问数量
     */
    @Column(name = "visit_count")
    private Integer visitCount;

    /**
     * 显示图片主图
     */
    @Column(name = "show_image")
    private String showImage;

    /**
     * 促销价
     */
    @Column(name = "promotion_price")
    private BigDecimal promotionPrice;

    /**
     * 是否显示价格
     */
    @Column(name = "show_price")
    private Byte showPrice;

    /**
     * 是否为精品
     */
    @Column(name = "is_best")
    private Byte isBest;

    /**
     * 是否为热销
     */
    @Column(name = "is_hot")
    private Byte isHot;

    /**
     * 是否为新品
     */
    @Column(name = "is_new")
    private Byte isNew;

    /**
     * 是否促销
     */
    @Column(name = "is_promotion")
    private Byte isPromotion;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 排序
     */
    private Integer sequence;

    /**
     * sku编码
     */
    @Column(name = "sku_sn")
    private String skuSn;

    @Column(name = "product_id")
    private Integer productId;

    /**
     * 店铺
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 获取skuid
     *
     * @return id - skuid
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置skuid
     *
     * @param id skuid
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return sku1
     */
    public String getSku1() {
        return sku1;
    }

    /**
     * @param sku1
     */
    public void setSku1(String sku1) {
        this.sku1 = sku1;
    }

    /**
     * @return sku2
     */
    public String getSku2() {
        return sku2;
    }

    /**
     * @param sku2
     */
    public void setSku2(String sku2) {
        this.sku2 = sku2;
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
     * 获取库存数量
     *
     * @return stock_count - 库存数量
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * 设置库存数量
     *
     * @param stockCount 库存数量
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * 获取销售数量
     *
     * @return sale_count - 销售数量
     */
    public Integer getSaleCount() {
        return saleCount;
    }

    /**
     * 设置销售数量
     *
     * @param saleCount 销售数量
     */
    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    /**
     * 获取成本价
     *
     * @return cost_price - 成本价
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 设置成本价
     *
     * @param costPrice 成本价
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 获取市场价
     *
     * @return market_price - 市场价
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置市场价
     *
     * @param marketPrice 市场价
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 获取评价数量
     *
     * @return review_count - 评价数量
     */
    public String getReviewCount() {
        return reviewCount;
    }

    /**
     * 设置评价数量
     *
     * @param reviewCount 评价数量
     */
    public void setReviewCount(String reviewCount) {
        this.reviewCount = reviewCount;
    }

    /**
     * 获取访问数量
     *
     * @return visit_count - 访问数量
     */
    public Integer getVisitCount() {
        return visitCount;
    }

    /**
     * 设置访问数量
     *
     * @param visitCount 访问数量
     */
    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    /**
     * 获取显示图片主图
     *
     * @return show_image - 显示图片主图
     */
    public String getShowImage() {
        return showImage;
    }

    /**
     * 设置显示图片主图
     *
     * @param showImage 显示图片主图
     */
    public void setShowImage(String showImage) {
        this.showImage = showImage;
    }

    /**
     * 获取促销价
     *
     * @return promotion_price - 促销价
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置促销价
     *
     * @param promotionPrice 促销价
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 获取是否显示价格
     *
     * @return show_price - 是否显示价格
     */
    public Byte getShowPrice() {
        return showPrice;
    }

    /**
     * 设置是否显示价格
     *
     * @param showPrice 是否显示价格
     */
    public void setShowPrice(Byte showPrice) {
        this.showPrice = showPrice;
    }

    /**
     * 获取是否为精品
     *
     * @return is_best - 是否为精品
     */
    public Byte getIsBest() {
        return isBest;
    }

    /**
     * 设置是否为精品
     *
     * @param isBest 是否为精品
     */
    public void setIsBest(Byte isBest) {
        this.isBest = isBest;
    }

    /**
     * 获取是否为热销
     *
     * @return is_hot - 是否为热销
     */
    public Byte getIsHot() {
        return isHot;
    }

    /**
     * 设置是否为热销
     *
     * @param isHot 是否为热销
     */
    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    /**
     * 获取是否为新品
     *
     * @return is_new - 是否为新品
     */
    public Byte getIsNew() {
        return isNew;
    }

    /**
     * 设置是否为新品
     *
     * @param isNew 是否为新品
     */
    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    /**
     * 获取是否促销
     *
     * @return is_promotion - 是否促销
     */
    public Byte getIsPromotion() {
        return isPromotion;
    }

    /**
     * 设置是否促销
     *
     * @param isPromotion 是否促销
     */
    public void setIsPromotion(Byte isPromotion) {
        this.isPromotion = isPromotion;
    }

    /**
     * @return add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
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
     * 获取sku编码
     *
     * @return sku_sn - sku编码
     */
    public String getSkuSn() {
        return skuSn;
    }

    /**
     * 设置sku编码
     *
     * @param skuSn sku编码
     */
    public void setSkuSn(String skuSn) {
        this.skuSn = skuSn;
    }

    /**
     * @return product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId
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