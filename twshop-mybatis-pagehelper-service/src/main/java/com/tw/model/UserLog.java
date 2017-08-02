package com.tw.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_log")
public class UserLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * userid
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 登入ip
     */
    private String ip;

    /**
     * 登入地点
     */
    private String location;

    /**
     * 登入类型：0 公众号；1 小程序；2 手机app
     */
    private Byte type;

    /**
     * 店铺
     */
    @Column(name = "shop_id")
    private Integer shopId;

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
     * 获取userid
     *
     * @return user_id - userid
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置userid
     *
     * @param userId userid
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取登入ip
     *
     * @return ip - 登入ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置登入ip
     *
     * @param ip 登入ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取登入地点
     *
     * @return location - 登入地点
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置登入地点
     *
     * @param location 登入地点
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取登入类型：0 公众号；1 小程序；2 手机app
     *
     * @return type - 登入类型：0 公众号；1 小程序；2 手机app
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置登入类型：0 公众号；1 小程序；2 手机app
     *
     * @param type 登入类型：0 公众号；1 小程序；2 手机app
     */
    public void setType(Byte type) {
        this.type = type;
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