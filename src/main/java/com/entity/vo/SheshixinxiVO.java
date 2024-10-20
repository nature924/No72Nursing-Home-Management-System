package com.entity.vo;

import com.entity.SheshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设施信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public class SheshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
