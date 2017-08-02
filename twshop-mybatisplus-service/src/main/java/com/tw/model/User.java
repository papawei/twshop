package com.tw.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

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
	private Integer state;
    /**
     * 添加时间
     */
	@TableField("add_time")
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
	private Integer layer;
    /**
     * 父级id
     */
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 类型：0 普通用户  ；1 官方；2代理
     */
	private Integer type;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getLayer() {
		return layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", mobile=" + mobile +
			", wechat=" + wechat +
			", state=" + state +
			", addTime=" + addTime +
			", desc=" + desc +
			", address=" + address +
			", guid=" + guid +
			", path=" + path +
			", layer=" + layer +
			", parentId=" + parentId +
			", type=" + type +
			", updateTime=" + updateTime +
			"}";
	}
}
