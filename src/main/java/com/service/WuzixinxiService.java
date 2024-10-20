package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzixinxiView;


/**
 * 物资信息
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface WuzixinxiService extends IService<WuzixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzixinxiVO> selectListVO(Wrapper<WuzixinxiEntity> wrapper);
   	
   	WuzixinxiVO selectVO(@Param("ew") Wrapper<WuzixinxiEntity> wrapper);
   	
   	List<WuzixinxiView> selectListView(Wrapper<WuzixinxiEntity> wrapper);
   	
   	WuzixinxiView selectView(@Param("ew") Wrapper<WuzixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzixinxiEntity> wrapper);
   	

}

