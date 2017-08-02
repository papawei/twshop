package com.tw.model;

import javax.persistence.*;

public class Shop {
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
     * 描述
     */
    private String desc;

    /**
     * 店铺唯一标识
     */
    private String guid;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 状态：0 正常；1禁用
     */
    private Byte state;

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
     * 获取店铺唯一标识
     *
     * @return guid - 店铺唯一标识
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置店铺唯一标识
     *
     * @param guid 店铺唯一标识
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取状态：0 正常；1禁用
     *
     * @return state - 状态：0 正常；1禁用
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态：0 正常；1禁用
     *
     * @param state 状态：0 正常；1禁用
     */
    public void setState(Byte state) {
        this.state = state;
    }
}