package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzichukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzichukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzichukuView;


/**
 * 物资出库
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface WuzichukuService extends IService<WuzichukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzichukuVO> selectListVO(Wrapper<WuzichukuEntity> wrapper);
   	
   	WuzichukuVO selectVO(@Param("ew") Wrapper<WuzichukuEntity> wrapper);
   	
   	List<WuzichukuView> selectListView(Wrapper<WuzichukuEntity> wrapper);
   	
   	WuzichukuView selectView(@Param("ew") Wrapper<WuzichukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzichukuEntity> wrapper);
   	

}

