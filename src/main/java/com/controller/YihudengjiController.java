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

import com.entity.YihudengjiEntity;
import com.entity.view.YihudengjiView;

import com.service.YihudengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 医护等级
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/yihudengji")
public class YihudengjiController {
    @Autowired
    private YihudengjiService yihudengjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YihudengjiEntity yihudengji,
		HttpServletRequest request){
        EntityWrapper<YihudengjiEntity> ew = new EntityWrapper<YihudengjiEntity>();

		PageUtils page = yihudengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yihudengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YihudengjiEntity yihudengji, 
		HttpServletRequest request){
        EntityWrapper<YihudengjiEntity> ew = new EntityWrapper<YihudengjiEntity>();

		PageUtils page = yihudengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yihudengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YihudengjiEntity yihudengji){
       	EntityWrapper<YihudengjiEntity> ew = new EntityWrapper<YihudengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yihudengji, "yihudengji")); 
        return R.ok().put("data", yihudengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YihudengjiEntity yihudengji){
        EntityWrapper< YihudengjiEntity> ew = new EntityWrapper< YihudengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yihudengji, "yihudengji")); 
		YihudengjiView yihudengjiView =  yihudengjiService.selectView(ew);
		return R.ok("查询医护等级成功").put("data", yihudengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YihudengjiEntity yihudengji = yihudengjiService.selectById(id);
        return R.ok().put("data", yihudengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YihudengjiEntity yihudengji = yihudengjiService.selectById(id);
        return R.ok().put("data", yihudengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YihudengjiEntity yihudengji, HttpServletRequest request){
    	yihudengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yihudengji);
        yihudengjiService.insert(yihudengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YihudengjiEntity yihudengji, HttpServletRequest request){
    	yihudengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yihudengji);
        yihudengjiService.insert(yihudengji);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YihudengjiEntity yihudengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yihudengji);
        yihudengjiService.updateById(yihudengji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yihudengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
