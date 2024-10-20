package com.entity.vo;

import com.entity.JiankangdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康档案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public class JiankangdanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
