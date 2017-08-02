package com.tw.model;

import javax.persistence.*;

@Table(name = "sku_image")
public class SkuImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "sku_id")
    private Integer skuId;

    private String src;

    /**
     * product_id
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return sku_id
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * @param skuId
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * @return src
     */
    public String getSrc() {
        return src;
    }

    /**
     * @param src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * 获取product_id
     *
     * @return product_id - product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置product_id
     *
     * @param productId product_id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}