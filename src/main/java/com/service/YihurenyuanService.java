package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihurenyuanView;


/**
 * 医护人员
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface YihurenyuanService extends IService<YihurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihurenyuanVO> selectListVO(Wrapper<YihurenyuanEntity> wrapper);
   	
   	YihurenyuanVO selectVO(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
   	
   	List<YihurenyuanView> selectListView(Wrapper<YihurenyuanEntity> wrapper);
   	
   	YihurenyuanView selectView(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihurenyuanEntity> wrapper);
   	

}

