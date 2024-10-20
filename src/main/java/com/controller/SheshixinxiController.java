package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SheshixinxiEntity;
import com.entity.view.SheshixinxiView;

import com.service.SheshixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 设施信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/sheshixinxi")
public class SheshixinxiController {
    @Autowired
    private SheshixinxiService sheshixinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SheshixinxiEntity sheshixinxi,
		HttpServletRequest request){
        EntityWrapper<SheshixinxiEntity> ew = new EntityWrapper<SheshixinxiEntity>();

		PageUtils page = sheshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sheshixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SheshixinxiEntity sheshixinxi, 
		HttpServletRequest request){
        EntityWrapper<SheshixinxiEntity> ew = new EntityWrapper<SheshixinxiEntity>();

		PageUtils page = sheshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sheshixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SheshixinxiEntity sheshixinxi){
       	EntityWrapper<SheshixinxiEntity> ew = new EntityWrapper<SheshixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sheshixinxi, "sheshixinxi")); 
        return R.ok().put("data", sheshixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SheshixinxiEntity sheshixinxi){
        EntityWrapper< SheshixinxiEntity> ew = new EntityWrapper< SheshixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sheshixinxi, "sheshixinxi")); 
		SheshixinxiView sheshixinxiView =  sheshixinxiService.selectView(ew);
		return R.ok("查询设施信息成功").put("data", sheshixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SheshixinxiEntity sheshixinxi = sheshixinxiService.selectById(id);
        return R.ok().put("data", sheshixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SheshixinxiEntity sheshixinxi = sheshixinxiService.selectById(id);
        return R.ok().put("data", sheshixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SheshixinxiEntity sheshixinxi, HttpServletRequest request){
    	sheshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sheshixinxi);
        sheshixinxiService.insert(sheshixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SheshixinxiEntity sheshixinxi, HttpServletRequest request){
    	sheshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sheshixinxi);
        sheshixinxiService.insert(sheshixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SheshixinxiEntity sheshixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sheshixinxi);
        sheshixinxiService.updateById(sheshixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sheshixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
