package com.dao;

import com.entity.FuwugongdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwugongdanVO;
import com.entity.view.FuwugongdanView;


/**
 * 服务工单
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface FuwugongdanDao extends BaseMapper<FuwugongdanEntity> {
	
	List<FuwugongdanVO> selectListVO(@Param("ew") Wrapper<FuwugongdanEntity> wrapper);
	
	FuwugongdanVO selectVO(@Param("ew") Wrapper<FuwugongdanEntity> wrapper);
	
	List<FuwugongdanView> selectListView(@Param("ew") Wrapper<FuwugongdanEntity> wrapper);

	List<FuwugongdanView> selectListView(Pagination page,@Param("ew") Wrapper<FuwugongdanEntity> wrapper);
	
	FuwugongdanView selectView(@Param("ew") Wrapper<FuwugongdanEntity> wrapper);
	

}
