package com.entity.view;

import com.entity.WuzixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("wuzixinxi")
public class WuzixinxiView  extends WuzixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzixinxiView(){
	}
 
 	public WuzixinxiView(WuzixinxiEntity wuzixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wuzixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
