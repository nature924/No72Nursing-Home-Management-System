package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 膳食信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("shanshixinxi")
public class ShanshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShanshixinxiEntity() {
		
	}
	
	public ShanshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 早餐
	 */
					
	private String zaocan;
	
	/**
	 * 午餐
	 */
					
	private String wucan;
	
	/**
	 * 晚餐
	 */
					
	private String wancan;
	
	/**
	 * 点心
	 */
					
	private String dianxin;
	
	/**
	 * 水果
	 */
					
	private String shuiguo;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：早餐
	 */
	public void setZaocan(String zaocan) {
		this.zaocan = zaocan;
	}
	/**
	 * 获取：早餐
	 */
	public String getZaocan() {
		return zaocan;
	}
	/**
	 * 设置：午餐
	 */
	public void setWucan(String wucan) {
		this.wucan = wucan;
	}
	/**
	 * 获取：午餐
	 */
	public String getWucan() {
		return wucan;
	}
	/**
	 * 设置：晚餐
	 */
	public void setWancan(String wancan) {
		this.wancan = wancan;
	}
	/**
	 * 获取：晚餐
	 */
	public String getWancan() {
		return wancan;
	}
	/**
	 * 设置：点心
	 */
	public void setDianxin(String dianxin) {
		this.dianxin = dianxin;
	}
	/**
	 * 获取：点心
	 */
	public String getDianxin() {
		return dianxin;
	}
	/**
	 * 设置：水果
	 */
	public void setShuiguo(String shuiguo) {
		this.shuiguo = shuiguo;
	}
	/**
	 * 获取：水果
	 */
	public String getShuiguo() {
		return shuiguo;
	}

}
