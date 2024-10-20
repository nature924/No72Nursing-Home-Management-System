package com.dao;

import com.entity.QingjiashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QingjiashenqingVO;
import com.entity.view.QingjiashenqingView;


/**
 * 请假申请
 * 
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
public interface QingjiashenqingDao extends BaseMapper<QingjiashenqingEntity> {
	
	List<QingjiashenqingVO> selectListVO(@Param("ew") Wrapper<QingjiashenqingEntity> wrapper);
	
	QingjiashenqingVO selectVO(@Param("ew") Wrapper<QingjiashenqingEntity> wrapper);
	
	List<QingjiashenqingView> selectListView(@Param("ew") Wrapper<QingjiashenqingEntity> wrapper);

	List<QingjiashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<QingjiashenqingEntity> wrapper);
	
	QingjiashenqingView selectView(@Param("ew") Wrapper<QingjiashenqingEntity> wrapper);
	

}
