package com.dao;

import com.entity.SheshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheshixinxiVO;
import com.entity.view.SheshixinxiView;


/**
 * 设施信息
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface SheshixinxiDao extends BaseMapper<SheshixinxiEntity> {
	
	List<SheshixinxiVO> selectListVO(@Param("ew") Wrapper<SheshixinxiEntity> wrapper);
	
	SheshixinxiVO selectVO(@Param("ew") Wrapper<SheshixinxiEntity> wrapper);
	
	List<SheshixinxiView> selectListView(@Param("ew") Wrapper<SheshixinxiEntity> wrapper);

	List<SheshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SheshixinxiEntity> wrapper);
	
	SheshixinxiView selectView(@Param("ew") Wrapper<SheshixinxiEntity> wrapper);
	

}
