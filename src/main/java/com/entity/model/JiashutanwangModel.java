package com.entity.model;

import com.entity.JiashutanwangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 家属探望
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public class JiashutanwangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 老人姓名
	 */
	
	private String laorenxingming;
		
	/**
	 * 家属姓名
	 */
	
	private String jiashuxingming;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 健康码
	 */
	
	private String jiankangma;
		
	/**
	 * 行程码
	 */
	
	private String xingchengma;
		
	/**
	 * 核酸检测结果
	 */
	
	private String hesuanjiancejieguo;
		
	/**
	 * 探望时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tanwangshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：健康码
	 */
	 
	public void setJiankangma(String jiankangma) {
		this.jiankangma = jiankangma;
	}
	
	/**
	 * 获取：健康码
	 */
	public String getJiankangma() {
		return jiankangma;
	}
				
	
	/**
	 * 设置：行程码
	 */
	 
	public void setXingchengma(String xingchengma) {
		this.xingchengma = xingchengma;
	}
	
	/**
	 * 获取：行程码
	 */
	public String getXingchengma() {
		return xingchengma;
	}
				
	
	/**
	 * 设置：核酸检测结果
	 */
	 
	public void setHesuanjiancejieguo(String hesuanjiancejieguo) {
		this.hesuanjiancejieguo = hesuanjiancejieguo;
	}
	
	/**
	 * 获取：核酸检测结果
	 */
	public String getHesuanjiancejieguo() {
		return hesuanjiancejieguo;
	}
				
	
	/**
	 * 设置：探望时间
	 */
	 
	public void setTanwangshijian(Date tanwangshijian) {
		this.tanwangshijian = tanwangshijian;
	}
	
	/**
	 * 获取：探望时间
	 */
	public Date getTanwangshijian() {
		return tanwangshijian;
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
