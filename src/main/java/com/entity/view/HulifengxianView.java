package com.entity.view;

import com.entity.HulifengxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 护理风险
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("hulifengxian")
public class HulifengxianView  extends HulifengxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HulifengxianView(){
	}
 
 	public HulifengxianView(HulifengxianEntity hulifengxianEntity){
 	try {
			BeanUtils.copyProperties(this, hulifengxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
