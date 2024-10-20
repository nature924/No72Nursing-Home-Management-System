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


import com.dao.WuzixinxiDao;
import com.entity.WuzixinxiEntity;
import com.service.WuzixinxiService;
import com.entity.vo.WuzixinxiVO;
import com.entity.view.WuzixinxiView;

@Service("wuzixinxiService")
public class WuzixinxiServiceImpl extends ServiceImpl<WuzixinxiDao, WuzixinxiEntity> implements WuzixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzixinxiEntity> page = this.selectPage(
                new Query<WuzixinxiEntity>(params).getPage(),
                new EntityWrapper<WuzixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzixinxiEntity> wrapper) {
		  Page<WuzixinxiView> page =new Query<WuzixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzixinxiVO> selectListVO(Wrapper<WuzixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzixinxiVO selectVO(Wrapper<WuzixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzixinxiView> selectListView(Wrapper<WuzixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzixinxiView selectView(Wrapper<WuzixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
