package com.dao;

import com.entity.WuzichukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzichukuVO;
import com.entity.view.WuzichukuView;


/**
 * 物资出库
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface WuzichukuDao extends BaseMapper<WuzichukuEntity> {
	
	List<WuzichukuVO> selectListVO(@Param("ew") Wrapper<WuzichukuEntity> wrapper);
	
	WuzichukuVO selectVO(@Param("ew") Wrapper<WuzichukuEntity> wrapper);
	
	List<WuzichukuView> selectListView(@Param("ew") Wrapper<WuzichukuEntity> wrapper);

	List<WuzichukuView> selectListView(Pagination page,@Param("ew") Wrapper<WuzichukuEntity> wrapper);
	
	WuzichukuView selectView(@Param("ew") Wrapper<WuzichukuEntity> wrapper);
	

}
