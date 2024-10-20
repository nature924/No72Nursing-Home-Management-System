package com.dao;

import com.entity.YihudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihudengjiVO;
import com.entity.view.YihudengjiView;


/**
 * 医护等级
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface YihudengjiDao extends BaseMapper<YihudengjiEntity> {
	
	List<YihudengjiVO> selectListVO(@Param("ew") Wrapper<YihudengjiEntity> wrapper);
	
	YihudengjiVO selectVO(@Param("ew") Wrapper<YihudengjiEntity> wrapper);
	
	List<YihudengjiView> selectListView(@Param("ew") Wrapper<YihudengjiEntity> wrapper);

	List<YihudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<YihudengjiEntity> wrapper);
	
	YihudengjiView selectView(@Param("ew") Wrapper<YihudengjiEntity> wrapper);
	

}
