package com.tw.model;

import javax.persistence.*;

public class Category {
    /**
     * 分类id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父级id
     */
    @Column(name = "parent_id")
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
    @Column(name = "price_range")
    private String priceRange;

    /**
     * 层级
     */
    private Byte layer;

    /**
     * 是否有子级
     */
    @Column(name = "has_child")
    private Boolean hasChild;

    /**
     * 店铺
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 状态:0 正常 ;1 禁用
     */
    private Byte state;

    /**
     * 获取分类id
     *
     * @return id - 分类id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置分类id
     *
     * @param id 分类id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父级id
     *
     * @return parent_id - 父级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级id
     *
     * @param parentId 父级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取路径
     *
     * @return path - 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path;
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
     * 获取价格范围，用“|”分隔开
     *
     * @return price_range - 价格范围，用“|”分隔开
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     * 设置价格范围，用“|”分隔开
     *
     * @param priceRange 价格范围，用“|”分隔开
     */
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    /**
     * 获取层级
     *
     * @return layer - 层级
     */
    public Byte getLayer() {
        return layer;
    }

    /**
     * 设置层级
     *
     * @param layer 层级
     */
    public void setLayer(Byte layer) {
        this.layer = layer;
    }

    /**
     * 获取是否有子级
     *
     * @return has_child - 是否有子级
     */
    public Boolean getHasChild() {
        return hasChild;
    }

    /**
     * 设置是否有子级
     *
     * @param hasChild 是否有子级
     */
    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
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

    /**
     * 获取状态:0 正常 ;1 禁用
     *
     * @return state - 状态:0 正常 ;1 禁用
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态:0 正常 ;1 禁用
     *
     * @param state 状态:0 正常 ;1 禁用
     */
    public void setState(Byte state) {
        this.state = state;
    }
}