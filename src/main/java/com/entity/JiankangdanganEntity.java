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
 * 健康档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("jiankangdangan")
public class JiankangdanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangdanganEntity() {
		
	}
	
	public JiankangdanganEntity(T t) {
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
	 * 档案编号
	 */
					
	private String danganbianhao;
	
	/**
	 * 老人编号
	 */
					
	private String laorenbianhao;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 老人性别
	 */
					
	private String laorenxingbie;
	
	/**
	 * 老人年龄
	 */
					
	private String laorennianling;
	
	/**
	 * 身体情况
	 */
					
	private String shentiqingkuang;
	
	/**
	 * 家族遗传史
	 */
					
	private String jiazuyichuanshi;
	
	/**
	 * 生活禁忌
	 */
					
	private String shenghuojinji;
	
	/**
	 * 药物过敏史
	 */
					
	private String yaowuguominshi;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
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
	 * 设置：档案编号
	 */
	public void setDanganbianhao(String danganbianhao) {
		this.danganbianhao = danganbianhao;
	}
	/**
	 * 获取：档案编号
	 */
	public String getDanganbianhao() {
		return danganbianhao;
	}
	/**
	 * 设置：老人编号
	 */
	public void setLaorenbianhao(String laorenbianhao) {
		this.laorenbianhao = laorenbianhao;
	}
	/**
	 * 获取：老人编号
	 */
	public String getLaorenbianhao() {
		return laorenbianhao;
	}
	/**
	 * 设置：老人姓名
	 */
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
	/**
	 * 设置：老人性别
	 */
	public void setLaorenxingbie(String laorenxingbie) {
		this.laorenxingbie = laorenxingbie;
	}
	/**
	 * 获取：老人性别
	 */
	public String getLaorenxingbie() {
		return laorenxingbie;
	}
	/**
	 * 设置：老人年龄
	 */
	public void setLaorennianling(String laorennianling) {
		this.laorennianling = laorennianling;
	}
	/**
	 * 获取：老人年龄
	 */
	public String getLaorennianling() {
		return laorennianling;
	}
	/**
	 * 设置：身体情况
	 */
	public void setShentiqingkuang(String shentiqingkuang) {
		this.shentiqingkuang = shentiqingkuang;
	}
	/**
	 * 获取：身体情况
	 */
	public String getShentiqingkuang() {
		return shentiqingkuang;
	}
	/**
	 * 设置：家族遗传史
	 */
	public void setJiazuyichuanshi(String jiazuyichuanshi) {
		this.jiazuyichuanshi = jiazuyichuanshi;
	}
	/**
	 * 获取：家族遗传史
	 */
	public String getJiazuyichuanshi() {
		return jiazuyichuanshi;
	}
	/**
	 * 设置：生活禁忌
	 */
	public void setShenghuojinji(String shenghuojinji) {
		this.shenghuojinji = shenghuojinji;
	}
	/**
	 * 获取：生活禁忌
	 */
	public String getShenghuojinji() {
		return shenghuojinji;
	}
	/**
	 * 设置：药物过敏史
	 */
	public void setYaowuguominshi(String yaowuguominshi) {
		this.yaowuguominshi = yaowuguominshi;
	}
	/**
	 * 获取：药物过敏史
	 */
	public String getYaowuguominshi() {
		return yaowuguominshi;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
