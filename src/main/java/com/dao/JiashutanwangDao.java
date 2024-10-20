package com.dao;

import com.entity.JiashutanwangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiashutanwangVO;
import com.entity.view.JiashutanwangView;


/**
 * 家属探望
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface JiashutanwangDao extends BaseMapper<JiashutanwangEntity> {
	
	List<JiashutanwangVO> selectListVO(@Param("ew") Wrapper<JiashutanwangEntity> wrapper);
	
	JiashutanwangVO selectVO(@Param("ew") Wrapper<JiashutanwangEntity> wrapper);
	
	List<JiashutanwangView> selectListView(@Param("ew") Wrapper<JiashutanwangEntity> wrapper);

	List<JiashutanwangView> selectListView(Pagination page,@Param("ew") Wrapper<JiashutanwangEntity> wrapper);
	
	JiashutanwangView selectView(@Param("ew") Wrapper<JiashutanwangEntity> wrapper);
	

}
