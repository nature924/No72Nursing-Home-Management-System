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
 * 来访登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("laifangdengji")
public class LaifangdengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaifangdengjiEntity() {
		
	}
	
	public LaifangdengjiEntity(T t) {
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
	 * 来访分类
	 */
					
	private String laifangfenlei;
	
	/**
	 * 来访时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date laifangshijian;
	
	/**
	 * 来访过程
	 */
					
	private String laifangguocheng;
	
	
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
	 * 设置：来访分类
	 */
	public void setLaifangfenlei(String laifangfenlei) {
		this.laifangfenlei = laifangfenlei;
	}
	/**
	 * 获取：来访分类
	 */
	public String getLaifangfenlei() {
		return laifangfenlei;
	}
	/**
	 * 设置：来访时间
	 */
	public void setLaifangshijian(Date laifangshijian) {
		this.laifangshijian = laifangshijian;
	}
	/**
	 * 获取：来访时间
	 */
	public Date getLaifangshijian() {
		return laifangshijian;
	}
	/**
	 * 设置：来访过程
	 */
	public void setLaifangguocheng(String laifangguocheng) {
		this.laifangguocheng = laifangguocheng;
	}
	/**
	 * 获取：来访过程
	 */
	public String getLaifangguocheng() {
		return laifangguocheng;
	}

}
