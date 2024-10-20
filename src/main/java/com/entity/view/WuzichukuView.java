package com.entity.view;

import com.entity.WuzichukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("wuzichuku")
public class WuzichukuView  extends WuzichukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzichukuView(){
	}
 
 	public WuzichukuView(WuzichukuEntity wuzichukuEntity){
 	try {
			BeanUtils.copyProperties(this, wuzichukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
