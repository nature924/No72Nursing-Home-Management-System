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


import com.dao.YuangongdanganDao;
import com.entity.YuangongdanganEntity;
import com.service.YuangongdanganService;
import com.entity.vo.YuangongdanganVO;
import com.entity.view.YuangongdanganView;

@Service("yuangongdanganService")
public class YuangongdanganServiceImpl extends ServiceImpl<YuangongdanganDao, YuangongdanganEntity> implements YuangongdanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongdanganEntity> page = this.selectPage(
                new Query<YuangongdanganEntity>(params).getPage(),
                new EntityWrapper<YuangongdanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongdanganEntity> wrapper) {
		  Page<YuangongdanganView> page =new Query<YuangongdanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongdanganVO> selectListVO(Wrapper<YuangongdanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongdanganVO selectVO(Wrapper<YuangongdanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongdanganView> selectListView(Wrapper<YuangongdanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongdanganView selectView(Wrapper<YuangongdanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
