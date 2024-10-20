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


import com.dao.HulijiluDao;
import com.entity.HulijiluEntity;
import com.service.HulijiluService;
import com.entity.vo.HulijiluVO;
import com.entity.view.HulijiluView;

@Service("hulijiluService")
public class HulijiluServiceImpl extends ServiceImpl<HulijiluDao, HulijiluEntity> implements HulijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HulijiluEntity> page = this.selectPage(
                new Query<HulijiluEntity>(params).getPage(),
                new EntityWrapper<HulijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HulijiluEntity> wrapper) {
		  Page<HulijiluView> page =new Query<HulijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HulijiluVO> selectListVO(Wrapper<HulijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HulijiluVO selectVO(Wrapper<HulijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HulijiluView> selectListView(Wrapper<HulijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HulijiluView selectView(Wrapper<HulijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
