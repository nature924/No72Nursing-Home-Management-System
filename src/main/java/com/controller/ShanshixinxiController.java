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

import com.entity.ShanshixinxiEntity;
import com.entity.view.ShanshixinxiView;

import com.service.ShanshixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 膳食信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/shanshixinxi")
public class ShanshixinxiController {
    @Autowired
    private ShanshixinxiService shanshixinxiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShanshixinxiEntity shanshixinxi,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<ShanshixinxiEntity> ew = new EntityWrapper<ShanshixinxiEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = shanshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shanshixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShanshixinxiEntity shanshixinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<ShanshixinxiEntity> ew = new EntityWrapper<ShanshixinxiEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = shanshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shanshixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShanshixinxiEntity shanshixinxi){
       	EntityWrapper<ShanshixinxiEntity> ew = new EntityWrapper<ShanshixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shanshixinxi, "shanshixinxi")); 
        return R.ok().put("data", shanshixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShanshixinxiEntity shanshixinxi){
        EntityWrapper< ShanshixinxiEntity> ew = new EntityWrapper< ShanshixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shanshixinxi, "shanshixinxi")); 
		ShanshixinxiView shanshixinxiView =  shanshixinxiService.selectView(ew);
		return R.ok("查询膳食信息成功").put("data", shanshixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShanshixinxiEntity shanshixinxi = shanshixinxiService.selectById(id);
        return R.ok().put("data", shanshixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShanshixinxiEntity shanshixinxi = shanshixinxiService.selectById(id);
        return R.ok().put("data", shanshixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShanshixinxiEntity shanshixinxi, HttpServletRequest request){
    	shanshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shanshixinxi);
        shanshixinxiService.insert(shanshixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShanshixinxiEntity shanshixinxi, HttpServletRequest request){
    	shanshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shanshixinxi);
        shanshixinxiService.insert(shanshixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShanshixinxiEntity shanshixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shanshixinxi);
        shanshixinxiService.updateById(shanshixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shanshixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
