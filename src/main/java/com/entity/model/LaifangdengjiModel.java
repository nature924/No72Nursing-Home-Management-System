package com.entity.model;

import com.entity.LaifangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 来访登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public class LaifangdengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 来访时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date laifangshijian;
		
	/**
	 * 来访过程
	 */
	
	private String laifangguocheng;
				
	
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
