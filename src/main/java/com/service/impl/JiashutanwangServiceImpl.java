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


import com.dao.JiashutanwangDao;
import com.entity.JiashutanwangEntity;
import com.service.JiashutanwangService;
import com.entity.vo.JiashutanwangVO;
import com.entity.view.JiashutanwangView;

@Service("jiashutanwangService")
public class JiashutanwangServiceImpl extends ServiceImpl<JiashutanwangDao, JiashutanwangEntity> implements JiashutanwangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiashutanwangEntity> page = this.selectPage(
                new Query<JiashutanwangEntity>(params).getPage(),
                new EntityWrapper<JiashutanwangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiashutanwangEntity> wrapper) {
		  Page<JiashutanwangView> page =new Query<JiashutanwangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiashutanwangVO> selectListVO(Wrapper<JiashutanwangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiashutanwangVO selectVO(Wrapper<JiashutanwangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiashutanwangView> selectListView(Wrapper<JiashutanwangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiashutanwangView selectView(Wrapper<JiashutanwangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
