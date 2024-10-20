package com.entity.view;

import com.entity.LaorenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 老人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("laoren")
public class LaorenView  extends LaorenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LaorenView(){
	}
 
 	public LaorenView(LaorenEntity laorenEntity){
 	try {
			BeanUtils.copyProperties(this, laorenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
