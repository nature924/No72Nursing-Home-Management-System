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


import com.dao.ShanshixinxiDao;
import com.entity.ShanshixinxiEntity;
import com.service.ShanshixinxiService;
import com.entity.vo.ShanshixinxiVO;
import com.entity.view.ShanshixinxiView;

@Service("shanshixinxiService")
public class ShanshixinxiServiceImpl extends ServiceImpl<ShanshixinxiDao, ShanshixinxiEntity> implements ShanshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShanshixinxiEntity> page = this.selectPage(
                new Query<ShanshixinxiEntity>(params).getPage(),
                new EntityWrapper<ShanshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShanshixinxiEntity> wrapper) {
		  Page<ShanshixinxiView> page =new Query<ShanshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShanshixinxiVO> selectListVO(Wrapper<ShanshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShanshixinxiVO selectVO(Wrapper<ShanshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShanshixinxiView> selectListView(Wrapper<ShanshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShanshixinxiView selectView(Wrapper<ShanshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
