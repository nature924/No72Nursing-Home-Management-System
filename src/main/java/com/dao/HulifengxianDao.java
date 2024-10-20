package com.dao;

import com.entity.HulifengxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HulifengxianVO;
import com.entity.view.HulifengxianView;


/**
 * 护理风险
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface HulifengxianDao extends BaseMapper<HulifengxianEntity> {
	
	List<HulifengxianVO> selectListVO(@Param("ew") Wrapper<HulifengxianEntity> wrapper);
	
	HulifengxianVO selectVO(@Param("ew") Wrapper<HulifengxianEntity> wrapper);
	
	List<HulifengxianView> selectListView(@Param("ew") Wrapper<HulifengxianEntity> wrapper);

	List<HulifengxianView> selectListView(Pagination page,@Param("ew") Wrapper<HulifengxianEntity> wrapper);
	
	HulifengxianView selectView(@Param("ew") Wrapper<HulifengxianEntity> wrapper);
	

}
