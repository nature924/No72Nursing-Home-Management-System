package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HulifengxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HulifengxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HulifengxianView;


/**
 * 护理风险
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface HulifengxianService extends IService<HulifengxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HulifengxianVO> selectListVO(Wrapper<HulifengxianEntity> wrapper);
   	
   	HulifengxianVO selectVO(@Param("ew") Wrapper<HulifengxianEntity> wrapper);
   	
   	List<HulifengxianView> selectListView(Wrapper<HulifengxianEntity> wrapper);
   	
   	HulifengxianView selectView(@Param("ew") Wrapper<HulifengxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HulifengxianEntity> wrapper);
   	

}

