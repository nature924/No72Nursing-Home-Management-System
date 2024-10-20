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
 * 设施信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("sheshixinxi")
public class SheshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SheshixinxiEntity() {
		
	}
	
	public SheshixinxiEntity(T t) {
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
	 * 设施编号
	 */
					
	private String sheshibianhao;
	
	/**
	 * 设施名称
	 */
					
	private String sheshimingcheng;
	
	/**
	 * 设施图片
	 */
					
	private String sheshitupian;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 使用年限
	 */
					
	private String shiyongnianxian;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	
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
	 * 设置：设施编号
	 */
	public void setSheshibianhao(String sheshibianhao) {
		this.sheshibianhao = sheshibianhao;
	}
	/**
	 * 获取：设施编号
	 */
	public String getSheshibianhao() {
		return sheshibianhao;
	}
	/**
	 * 设置：设施名称
	 */
	public void setSheshimingcheng(String sheshimingcheng) {
		this.sheshimingcheng = sheshimingcheng;
	}
	/**
	 * 获取：设施名称
	 */
	public String getSheshimingcheng() {
		return sheshimingcheng;
	}
	/**
	 * 设置：设施图片
	 */
	public void setSheshitupian(String sheshitupian) {
		this.sheshitupian = sheshitupian;
	}
	/**
	 * 获取：设施图片
	 */
	public String getSheshitupian() {
		return sheshitupian;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：使用年限
	 */
	public void setShiyongnianxian(String shiyongnianxian) {
		this.shiyongnianxian = shiyongnianxian;
	}
	/**
	 * 获取：使用年限
	 */
	public String getShiyongnianxian() {
		return shiyongnianxian;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}

}
