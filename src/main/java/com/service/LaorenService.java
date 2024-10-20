package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaorenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaorenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaorenView;


/**
 * 老人
 *
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface LaorenService extends IService<LaorenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaorenVO> selectListVO(Wrapper<LaorenEntity> wrapper);
   	
   	LaorenVO selectVO(@Param("ew") Wrapper<LaorenEntity> wrapper);
   	
   	List<LaorenView> selectListView(Wrapper<LaorenEntity> wrapper);
   	
   	LaorenView selectView(@Param("ew") Wrapper<LaorenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaorenEntity> wrapper);
   	

}

