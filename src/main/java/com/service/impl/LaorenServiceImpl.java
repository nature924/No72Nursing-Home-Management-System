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


import com.dao.LaorenDao;
import com.entity.LaorenEntity;
import com.service.LaorenService;
import com.entity.vo.LaorenVO;
import com.entity.view.LaorenView;

@Service("laorenService")
public class LaorenServiceImpl extends ServiceImpl<LaorenDao, LaorenEntity> implements LaorenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaorenEntity> page = this.selectPage(
                new Query<LaorenEntity>(params).getPage(),
                new EntityWrapper<LaorenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaorenEntity> wrapper) {
		  Page<LaorenView> page =new Query<LaorenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaorenVO> selectListVO(Wrapper<LaorenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaorenVO selectVO(Wrapper<LaorenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaorenView> selectListView(Wrapper<LaorenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaorenView selectView(Wrapper<LaorenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
