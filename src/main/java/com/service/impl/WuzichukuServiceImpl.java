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


import com.dao.WuzichukuDao;
import com.entity.WuzichukuEntity;
import com.service.WuzichukuService;
import com.entity.vo.WuzichukuVO;
import com.entity.view.WuzichukuView;

@Service("wuzichukuService")
public class WuzichukuServiceImpl extends ServiceImpl<WuzichukuDao, WuzichukuEntity> implements WuzichukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzichukuEntity> page = this.selectPage(
                new Query<WuzichukuEntity>(params).getPage(),
                new EntityWrapper<WuzichukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzichukuEntity> wrapper) {
		  Page<WuzichukuView> page =new Query<WuzichukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzichukuVO> selectListVO(Wrapper<WuzichukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzichukuVO selectVO(Wrapper<WuzichukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzichukuView> selectListView(Wrapper<WuzichukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzichukuView selectView(Wrapper<WuzichukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
