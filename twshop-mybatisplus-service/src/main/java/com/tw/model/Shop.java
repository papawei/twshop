package com.tw.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 店铺
 * </p>
 *
 * @author tw
 * @since 2017-08-01
 */
public class Shop extends Model<Shop> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
	@TableId(value="id", type= IdType.AUTO)
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
	@TableField("user_id")
	private Integer userId;
    /**
     * 状态：0 正常；1禁用
     */
	private Integer state;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Shop{" +
			"id=" + id +
			", name=" + name +
			", desc=" + desc +
			", guid=" + guid +
			", userId=" + userId +
			", state=" + state +
			"}";
	}
}
