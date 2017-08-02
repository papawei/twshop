package com.tw.model;

import javax.persistence.*;

public class Supplier {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Byte state;

    /**
     * 店铺
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
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
     * 获取logo
     *
     * @return logo - logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置logo
     *
     * @param logo logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取keywords
     *
     * @return keywords - keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置keywords
     *
     * @param keywords keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取描述
     *
     * @return desc - 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置描述
     *
     * @param desc 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取链接
     *
     * @return url - 链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接
     *
     * @param url 链接
     */
    public void setUrl(String url) {
        this.url = url;
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
     * 获取默认状态为0，0：正常；1：禁用
     *
     * @return state - 默认状态为0，0：正常；1：禁用
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置默认状态为0，0：正常；1：禁用
     *
     * @param state 默认状态为0，0：正常；1：禁用
     */
    public void setState(Byte state) {
        this.state = state;
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