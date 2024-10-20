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
 * 老人
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("laoren")
public class LaorenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaorenEntity() {
		
	}
	
	public LaorenEntity(T t) {
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
	 * 老人编号
	 */
					
	private String laorenbianhao;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 老人照片
	 */
					
	private String laorenzhaopian;
	
	/**
	 * 老人性别
	 */
					
	private String laorenxingbie;
	
	/**
	 * 老人年龄
	 */
					
	private String laorennianling;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 家属姓名
	 */
					
	private String jiashuxingming;
	
	/**
	 * 关系
	 */
					
	private String guanxi;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 家庭住址
	 */
					
	private String jiatingzhuzhi;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：老人照片
	 */
	public void setLaorenzhaopian(String laorenzhaopian) {
		this.laorenzhaopian = laorenzhaopian;
	}
	/**
	 * 获取：老人照片
	 */
	public String getLaorenzhaopian() {
		return laorenzhaopian;
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
	 * 设置：家属姓名
	 */
	public void setJiashuxingming(String jiashuxingming) {
		this.jiashuxingming = jiashuxingming;
	}
	/**
	 * 获取：家属姓名
	 */
	public String getJiashuxingming() {
		return jiashuxingming;
	}
	/**
	 * 设置：关系
	 */
	public void setGuanxi(String guanxi) {
		this.guanxi = guanxi;
	}
	/**
	 * 获取：关系
	 */
	public String getGuanxi() {
		return guanxi;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：家庭住址
	 */
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}

}
