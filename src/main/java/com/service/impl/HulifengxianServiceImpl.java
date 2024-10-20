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


import com.dao.HulifengxianDao;
import com.entity.HulifengxianEntity;
import com.service.HulifengxianService;
import com.entity.vo.HulifengxianVO;
import com.entity.view.HulifengxianView;

@Service("hulifengxianService")
public class HulifengxianServiceImpl extends ServiceImpl<HulifengxianDao, HulifengxianEntity> implements HulifengxianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HulifengxianEntity> page = this.selectPage(
                new Query<HulifengxianEntity>(params).getPage(),
                new EntityWrapper<HulifengxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HulifengxianEntity> wrapper) {
		  Page<HulifengxianView> page =new Query<HulifengxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HulifengxianVO> selectListVO(Wrapper<HulifengxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HulifengxianVO selectVO(Wrapper<HulifengxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HulifengxianView> selectListView(Wrapper<HulifengxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HulifengxianView selectView(Wrapper<HulifengxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
