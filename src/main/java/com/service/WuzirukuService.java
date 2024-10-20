package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzirukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzirukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzirukuView;


/**
 * 物资入库
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface WuzirukuService extends IService<WuzirukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzirukuVO> selectListVO(Wrapper<WuzirukuEntity> wrapper);
   	
   	WuzirukuVO selectVO(@Param("ew") Wrapper<WuzirukuEntity> wrapper);
   	
   	List<WuzirukuView> selectListView(Wrapper<WuzirukuEntity> wrapper);
   	
   	WuzirukuView selectView(@Param("ew") Wrapper<WuzirukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzirukuEntity> wrapper);
   	

}

