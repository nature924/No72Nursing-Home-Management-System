package com.entity.model;

import com.entity.HulijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 护理记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public class HulijiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	
	private Integer laorennianling;
		
	/**
	 * 房间号
	 */
	
	private String fangjianhao;
		
	/**
	 * 床位号
	 */
	
	private String chuangweihao;
		
	/**
	 * 血压
	 */
	
	private String xueya;
		
	/**
	 * 心率
	 */
	
	private String xinlv;
		
	/**
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 上厕所次数
	 */
	
	private String shangcesuocishu;
		
	/**
	 * 床单更换时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangdangenghuanshijian;
		
	/**
	 * 健康状况
	 */
	
	private String jiankangzhuangkuang;
		
	/**
	 * 医护工号
	 */
	
	private String yihugonghao;
		
	/**
	 * 医护姓名
	 */
	
	private String yihuxingming;
		
	/**
	 * 医护等级
	 */
	
	private String yihudengji;
		
	/**
	 * 等级时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 护理情况
	 */
	
	private String huliqingkuang;
				
	
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
	 
	public void setLaorennianling(Integer laorennianling) {
		this.laorennianling = laorennianling;
	}
	
	/**
	 * 获取：老人年龄
	 */
	public Integer getLaorennianling() {
		return laorennianling;
	}
				
	
	/**
	 * 设置：房间号
	 */
	 
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
				
	
	/**
	 * 设置：床位号
	 */
	 
	public void setChuangweihao(String chuangweihao) {
		this.chuangweihao = chuangweihao;
	}
	
	/**
	 * 获取：床位号
	 */
	public String getChuangweihao() {
		return chuangweihao;
	}
				
	
	/**
	 * 设置：血压
	 */
	 
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：心率
	 */
	 
	public void setXinlv(String xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率
	 */
	public String getXinlv() {
		return xinlv;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：上厕所次数
	 */
	 
	public void setShangcesuocishu(String shangcesuocishu) {
		this.shangcesuocishu = shangcesuocishu;
	}
	
	/**
	 * 获取：上厕所次数
	 */
	public String getShangcesuocishu() {
		return shangcesuocishu;
	}
				
	
	/**
	 * 设置：床单更换时间
	 */
	 
	public void setChuangdangenghuanshijian(Date chuangdangenghuanshijian) {
		this.chuangdangenghuanshijian = chuangdangenghuanshijian;
	}
	
	/**
	 * 获取：床单更换时间
	 */
	public Date getChuangdangenghuanshijian() {
		return chuangdangenghuanshijian;
	}
				
	
	/**
	 * 设置：健康状况
	 */
	 
	public void setJiankangzhuangkuang(String jiankangzhuangkuang) {
		this.jiankangzhuangkuang = jiankangzhuangkuang;
	}
	
	/**
	 * 获取：健康状况
	 */
	public String getJiankangzhuangkuang() {
		return jiankangzhuangkuang;
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
	 * 设置：医护等级
	 */
	 
	public void setYihudengji(String yihudengji) {
		this.yihudengji = yihudengji;
	}
	
	/**
	 * 获取：医护等级
	 */
	public String getYihudengji() {
		return yihudengji;
	}
				
	
	/**
	 * 设置：等级时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：等级时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：护理情况
	 */
	 
	public void setHuliqingkuang(String huliqingkuang) {
		this.huliqingkuang = huliqingkuang;
	}
	
	/**
	 * 获取：护理情况
	 */
	public String getHuliqingkuang() {
		return huliqingkuang;
	}
			
}
