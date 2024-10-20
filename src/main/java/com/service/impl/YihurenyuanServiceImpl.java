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


import com.dao.YihurenyuanDao;
import com.entity.YihurenyuanEntity;
import com.service.YihurenyuanService;
import com.entity.vo.YihurenyuanVO;
import com.entity.view.YihurenyuanView;

@Service("yihurenyuanService")
public class YihurenyuanServiceImpl extends ServiceImpl<YihurenyuanDao, YihurenyuanEntity> implements YihurenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihurenyuanEntity> page = this.selectPage(
                new Query<YihurenyuanEntity>(params).getPage(),
                new EntityWrapper<YihurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihurenyuanEntity> wrapper) {
		  Page<YihurenyuanView> page =new Query<YihurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihurenyuanVO> selectListVO(Wrapper<YihurenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihurenyuanVO selectVO(Wrapper<YihurenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihurenyuanView> selectListView(Wrapper<YihurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihurenyuanView selectView(Wrapper<YihurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
