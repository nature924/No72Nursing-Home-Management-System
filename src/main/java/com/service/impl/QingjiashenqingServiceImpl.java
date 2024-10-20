package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QingjiashenqingDao;
import com.entity.QingjiashenqingEntity;
import com.service.QingjiashenqingService;
import com.entity.vo.QingjiashenqingVO;
import com.entity.view.QingjiashenqingView;

@Service("qingjiashenqingService")
public class QingjiashenqingServiceImpl extends ServiceImpl<QingjiashenqingDao, QingjiashenqingEntity> implements QingjiashenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QingjiashenqingEntity> page = this.selectPage(
                new Query<QingjiashenqingEntity>(params).getPage(),
                new EntityWrapper<QingjiashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QingjiashenqingEntity> wrapper) {
		  Page<QingjiashenqingView> page =new Query<QingjiashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QingjiashenqingVO> selectListVO(Wrapper<QingjiashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QingjiashenqingVO selectVO(Wrapper<QingjiashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QingjiashenqingView> selectListView(Wrapper<QingjiashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QingjiashenqingView selectView(Wrapper<QingjiashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
