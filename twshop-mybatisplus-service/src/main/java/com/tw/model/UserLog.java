package com.tw.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 登录日志
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
@TableName("user_log")
public class UserLog extends Model<UserLog> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * userid
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 添加时间
     */
	@TableField("add_time")
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
	private Integer type;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
		return "UserLog{" +
			"id=" + id +
			", userId=" + userId +
			", addTime=" + addTime +
			", ip=" + ip +
			", location=" + location +
			", type=" + type +
			", shopId=" + shopId +
			"}";
	}
}
