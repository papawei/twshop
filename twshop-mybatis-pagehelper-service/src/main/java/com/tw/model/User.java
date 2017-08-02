package com.tw.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 手机号
     */
    private Integer mobile;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 默认状态为0，0：正常；1：禁用
     */
    private Byte state;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 描述
     */
    private String desc;

    /**
     * 地址
     */
    private String address;

    /**
     * 各个站点guid
     */
    private String guid;

    /**
     * 路径
     */
    private String path;

    /**
     * 层次
     */
    private Byte layer;

    /**
     * 父级id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 类型：0 普通用户  ；1 官方；2代理
     */
    private Byte type;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public Integer getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取微信号
     *
     * @return wechat - 微信号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信号
     *
     * @param wechat 微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
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
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取各个站点guid
     *
     * @return guid - 各个站点guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置各个站点guid
     *
     * @param guid 各个站点guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
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
     * 获取层次
     *
     * @return layer - 层次
     */
    public Byte getLayer() {
        return layer;
    }

    /**
     * 设置层次
     *
     * @param layer 层次
     */
    public void setLayer(Byte layer) {
        this.layer = layer;
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
     * 获取类型：0 普通用户  ；1 官方；2代理
     *
     * @return type - 类型：0 普通用户  ；1 官方；2代理
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置类型：0 普通用户  ；1 官方；2代理
     *
     * @param type 类型：0 普通用户  ；1 官方；2代理
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}