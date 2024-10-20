package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiashutanwangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiashutanwangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiashutanwangView;


/**
 * 家属探望
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface JiashutanwangService extends IService<JiashutanwangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiashutanwangVO> selectListVO(Wrapper<JiashutanwangEntity> wrapper);
   	
   	JiashutanwangVO selectVO(@Param("ew") Wrapper<JiashutanwangEntity> wrapper);
   	
   	List<JiashutanwangView> selectListView(Wrapper<JiashutanwangEntity> wrapper);
   	
   	JiashutanwangView selectView(@Param("ew") Wrapper<JiashutanwangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiashutanwangEntity> wrapper);
   	

}

