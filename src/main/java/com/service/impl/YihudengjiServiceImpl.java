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


import com.dao.YihudengjiDao;
import com.entity.YihudengjiEntity;
import com.service.YihudengjiService;
import com.entity.vo.YihudengjiVO;
import com.entity.view.YihudengjiView;

@Service("yihudengjiService")
public class YihudengjiServiceImpl extends ServiceImpl<YihudengjiDao, YihudengjiEntity> implements YihudengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihudengjiEntity> page = this.selectPage(
                new Query<YihudengjiEntity>(params).getPage(),
                new EntityWrapper<YihudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihudengjiEntity> wrapper) {
		  Page<YihudengjiView> page =new Query<YihudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihudengjiVO> selectListVO(Wrapper<YihudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihudengjiVO selectVO(Wrapper<YihudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihudengjiView> selectListView(Wrapper<YihudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihudengjiView selectView(Wrapper<YihudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
