package com.entity.view;

import com.entity.HulijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 护理记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("hulijilu")
public class HulijiluView  extends HulijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HulijiluView(){
	}
 
 	public HulijiluView(HulijiluEntity hulijiluEntity){
 	try {
			BeanUtils.copyProperties(this, hulijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
