package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingjiashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QingjiashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjiashenqingView;


/**
 * 请假申请
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface QingjiashenqingService extends IService<QingjiashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QingjiashenqingVO> selectListVO(Wrapper<QingjiashenqingEntity> wrapper);
   	
   	QingjiashenqingVO selectVO(@Param("ew") Wrapper<QingjiashenqingEntity> wrapper);
   	
   	List<QingjiashenqingView> selectListView(Wrapper<QingjiashenqingEntity> wrapper);
   	
   	QingjiashenqingView selectView(@Param("ew") Wrapper<QingjiashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QingjiashenqingEntity> wrapper);
   	

}

