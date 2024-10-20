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
 * 员工档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("yuangongdangan")
public class YuangongdanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongdanganEntity() {
		
	}
	
	public YuangongdanganEntity(T t) {
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
	 * 医护工号
	 */
					
	private String yihugonghao;
	
	/**
	 * 医护姓名
	 */
					
	private String yihuxingming;
	
	/**
	 * 医护性别
	 */
					
	private String yihuxingbie;
	
	/**
	 * 职称
	 */
					
	private String zhicheng;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 入职时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ruzhishijian;
	
	/**
	 * 离职时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date lizhishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：医护工号
	 */
	public void setYihugonghao(String yihugonghao) {
		this.yihugonghao = yihugonghao;
	}
	/**
	 * 获取：医护工号
	 */
	public String getYihugonghao() {
		return yihugonghao;
	}
	/**
	 * 设置：医护姓名
	 */
	public void setYihuxingming(String yihuxingming) {
		this.yihuxingming = yihuxingming;
	}
	/**
	 * 获取：医护姓名
	 */
	public String getYihuxingming() {
		return yihuxingming;
	}
	/**
	 * 设置：医护性别
	 */
	public void setYihuxingbie(String yihuxingbie) {
		this.yihuxingbie = yihuxingbie;
	}
	/**
	 * 获取：医护性别
	 */
	public String getYihuxingbie() {
		return yihuxingbie;
	}
	/**
	 * 设置：职称
	 */
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：入职时间
	 */
	public void setRuzhishijian(Date ruzhishijian) {
		this.ruzhishijian = ruzhishijian;
	}
	/**
	 * 获取：入职时间
	 */
	public Date getRuzhishijian() {
		return ruzhishijian;
	}
	/**
	 * 设置：离职时间
	 */
	public void setLizhishijian(Date lizhishijian) {
		this.lizhishijian = lizhishijian;
	}
	/**
	 * 获取：离职时间
	 */
	public Date getLizhishijian() {
		return lizhishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
