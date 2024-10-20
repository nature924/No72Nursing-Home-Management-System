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


import com.dao.FuwugongdanDao;
import com.entity.FuwugongdanEntity;
import com.service.FuwugongdanService;
import com.entity.vo.FuwugongdanVO;
import com.entity.view.FuwugongdanView;

@Service("fuwugongdanService")
public class FuwugongdanServiceImpl extends ServiceImpl<FuwugongdanDao, FuwugongdanEntity> implements FuwugongdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwugongdanEntity> page = this.selectPage(
                new Query<FuwugongdanEntity>(params).getPage(),
                new EntityWrapper<FuwugongdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwugongdanEntity> wrapper) {
		  Page<FuwugongdanView> page =new Query<FuwugongdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwugongdanVO> selectListVO(Wrapper<FuwugongdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwugongdanVO selectVO(Wrapper<FuwugongdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwugongdanView> selectListView(Wrapper<FuwugongdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwugongdanView selectView(Wrapper<FuwugongdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
