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
 * 家属探望
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("jiashutanwang")
public class JiashutanwangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiashutanwangEntity() {
		
	}
	
	public JiashutanwangEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tanwangshijian;
	
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
