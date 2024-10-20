package com.entity.view;

import com.entity.JiashutanwangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家属探望
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@TableName("jiashutanwang")
public class JiashutanwangView  extends JiashutanwangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiashutanwangView(){
	}
 
 	public JiashutanwangView(JiashutanwangEntity jiashutanwangEntity){
 	try {
			BeanUtils.copyProperties(this, jiashutanwangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
