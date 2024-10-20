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


import com.dao.WuzifenleiDao;
import com.entity.WuzifenleiEntity;
import com.service.WuzifenleiService;
import com.entity.vo.WuzifenleiVO;
import com.entity.view.WuzifenleiView;

@Service("wuzifenleiService")
public class WuzifenleiServiceImpl extends ServiceImpl<WuzifenleiDao, WuzifenleiEntity> implements WuzifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzifenleiEntity> page = this.selectPage(
                new Query<WuzifenleiEntity>(params).getPage(),
                new EntityWrapper<WuzifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzifenleiEntity> wrapper) {
		  Page<WuzifenleiView> page =new Query<WuzifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzifenleiVO> selectListVO(Wrapper<WuzifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzifenleiVO selectVO(Wrapper<WuzifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzifenleiView> selectListView(Wrapper<WuzifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzifenleiView selectView(Wrapper<WuzifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
