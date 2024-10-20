package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HulijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HulijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HulijiluView;


/**
 * 护理记录
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface HulijiluService extends IService<HulijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HulijiluVO> selectListVO(Wrapper<HulijiluEntity> wrapper);
   	
   	HulijiluVO selectVO(@Param("ew") Wrapper<HulijiluEntity> wrapper);
   	
   	List<HulijiluView> selectListView(Wrapper<HulijiluEntity> wrapper);
   	
   	HulijiluView selectView(@Param("ew") Wrapper<HulijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HulijiluEntity> wrapper);
   	

}

