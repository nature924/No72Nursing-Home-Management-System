package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheshixinxiView;


/**
 * 设施信息
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface SheshixinxiService extends IService<SheshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheshixinxiVO> selectListVO(Wrapper<SheshixinxiEntity> wrapper);
   	
   	SheshixinxiVO selectVO(@Param("ew") Wrapper<SheshixinxiEntity> wrapper);
   	
   	List<SheshixinxiView> selectListView(Wrapper<SheshixinxiEntity> wrapper);
   	
   	SheshixinxiView selectView(@Param("ew") Wrapper<SheshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheshixinxiEntity> wrapper);
   	

}

