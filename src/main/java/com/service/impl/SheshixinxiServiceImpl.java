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


import com.dao.SheshixinxiDao;
import com.entity.SheshixinxiEntity;
import com.service.SheshixinxiService;
import com.entity.vo.SheshixinxiVO;
import com.entity.view.SheshixinxiView;

@Service("sheshixinxiService")
public class SheshixinxiServiceImpl extends ServiceImpl<SheshixinxiDao, SheshixinxiEntity> implements SheshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheshixinxiEntity> page = this.selectPage(
                new Query<SheshixinxiEntity>(params).getPage(),
                new EntityWrapper<SheshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheshixinxiEntity> wrapper) {
		  Page<SheshixinxiView> page =new Query<SheshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheshixinxiVO> selectListVO(Wrapper<SheshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheshixinxiVO selectVO(Wrapper<SheshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheshixinxiView> selectListView(Wrapper<SheshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheshixinxiView selectView(Wrapper<SheshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
