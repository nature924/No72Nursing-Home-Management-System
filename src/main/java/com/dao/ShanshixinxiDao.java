package com.dao;

import com.entity.ShanshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShanshixinxiVO;
import com.entity.view.ShanshixinxiView;


/**
 * 膳食信息
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface ShanshixinxiDao extends BaseMapper<ShanshixinxiEntity> {
	
	List<ShanshixinxiVO> selectListVO(@Param("ew") Wrapper<ShanshixinxiEntity> wrapper);
	
	ShanshixinxiVO selectVO(@Param("ew") Wrapper<ShanshixinxiEntity> wrapper);
	
	List<ShanshixinxiView> selectListView(@Param("ew") Wrapper<ShanshixinxiEntity> wrapper);

	List<ShanshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShanshixinxiEntity> wrapper);
	
	ShanshixinxiView selectView(@Param("ew") Wrapper<ShanshixinxiEntity> wrapper);
	

}
