package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzifenleiView;


/**
 * 物资分类
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface WuzifenleiService extends IService<WuzifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzifenleiVO> selectListVO(Wrapper<WuzifenleiEntity> wrapper);
   	
   	WuzifenleiVO selectVO(@Param("ew") Wrapper<WuzifenleiEntity> wrapper);
   	
   	List<WuzifenleiView> selectListView(Wrapper<WuzifenleiEntity> wrapper);
   	
   	WuzifenleiView selectView(@Param("ew") Wrapper<WuzifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzifenleiEntity> wrapper);
   	

}

