package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwugongdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwugongdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwugongdanView;


/**
 * 服务工单
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface FuwugongdanService extends IService<FuwugongdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwugongdanVO> selectListVO(Wrapper<FuwugongdanEntity> wrapper);
   	
   	FuwugongdanVO selectVO(@Param("ew") Wrapper<FuwugongdanEntity> wrapper);
   	
   	List<FuwugongdanView> selectListView(Wrapper<FuwugongdanEntity> wrapper);
   	
   	FuwugongdanView selectView(@Param("ew") Wrapper<FuwugongdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwugongdanEntity> wrapper);
   	

}

