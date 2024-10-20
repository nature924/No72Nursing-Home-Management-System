package com.dao;

import com.entity.LaorenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaorenVO;
import com.entity.view.LaorenView;


/**
 * 老人
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface LaorenDao extends BaseMapper<LaorenEntity> {
	
	List<LaorenVO> selectListVO(@Param("ew") Wrapper<LaorenEntity> wrapper);
	
	LaorenVO selectVO(@Param("ew") Wrapper<LaorenEntity> wrapper);
	
	List<LaorenView> selectListView(@Param("ew") Wrapper<LaorenEntity> wrapper);

	List<LaorenView> selectListView(Pagination page,@Param("ew") Wrapper<LaorenEntity> wrapper);
	
	LaorenView selectView(@Param("ew") Wrapper<LaorenEntity> wrapper);
	

}
