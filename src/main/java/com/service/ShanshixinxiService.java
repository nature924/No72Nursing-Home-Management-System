package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShanshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShanshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShanshixinxiView;


/**
 * 膳食信息
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface ShanshixinxiService extends IService<ShanshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShanshixinxiVO> selectListVO(Wrapper<ShanshixinxiEntity> wrapper);
   	
   	ShanshixinxiVO selectVO(@Param("ew") Wrapper<ShanshixinxiEntity> wrapper);
   	
   	List<ShanshixinxiView> selectListView(Wrapper<ShanshixinxiEntity> wrapper);
   	
   	ShanshixinxiView selectView(@Param("ew") Wrapper<ShanshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShanshixinxiEntity> wrapper);
   	

}

