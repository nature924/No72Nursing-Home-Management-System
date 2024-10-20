package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihudengjiView;


/**
 * 医护等级
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface YihudengjiService extends IService<YihudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihudengjiVO> selectListVO(Wrapper<YihudengjiEntity> wrapper);
   	
   	YihudengjiVO selectVO(@Param("ew") Wrapper<YihudengjiEntity> wrapper);
   	
   	List<YihudengjiView> selectListView(Wrapper<YihudengjiEntity> wrapper);
   	
   	YihudengjiView selectView(@Param("ew") Wrapper<YihudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihudengjiEntity> wrapper);
   	

}

