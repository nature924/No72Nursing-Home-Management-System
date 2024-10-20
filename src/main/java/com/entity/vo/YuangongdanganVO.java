package com.entity.vo;

import com.entity.YuangongdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工档案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public class YuangongdanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
