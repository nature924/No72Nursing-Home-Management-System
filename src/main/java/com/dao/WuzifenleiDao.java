package com.dao;

import com.entity.WuzifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzifenleiVO;
import com.entity.view.WuzifenleiView;


/**
 * 物资分类
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface WuzifenleiDao extends BaseMapper<WuzifenleiEntity> {
	
	List<WuzifenleiVO> selectListVO(@Param("ew") Wrapper<WuzifenleiEntity> wrapper);
	
	WuzifenleiVO selectVO(@Param("ew") Wrapper<WuzifenleiEntity> wrapper);
	
	List<WuzifenleiView> selectListView(@Param("ew") Wrapper<WuzifenleiEntity> wrapper);

	List<WuzifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<WuzifenleiEntity> wrapper);
	
	WuzifenleiView selectView(@Param("ew") Wrapper<WuzifenleiEntity> wrapper);
	

}
