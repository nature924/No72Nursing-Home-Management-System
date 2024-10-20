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

import com.entity.WuzifenleiEntity;
import com.entity.view.WuzifenleiView;

import com.service.WuzifenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 物资分类
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/wuzifenlei")
public class WuzifenleiController {
    @Autowired
    private WuzifenleiService wuzifenleiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WuzifenleiEntity wuzifenlei,
		HttpServletRequest request){
        EntityWrapper<WuzifenleiEntity> ew = new EntityWrapper<WuzifenleiEntity>();

		PageUtils page = wuzifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzifenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WuzifenleiEntity wuzifenlei, 
		HttpServletRequest request){
        EntityWrapper<WuzifenleiEntity> ew = new EntityWrapper<WuzifenleiEntity>();

		PageUtils page = wuzifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzifenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WuzifenleiEntity wuzifenlei){
       	EntityWrapper<WuzifenleiEntity> ew = new EntityWrapper<WuzifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wuzifenlei, "wuzifenlei")); 
        return R.ok().put("data", wuzifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WuzifenleiEntity wuzifenlei){
        EntityWrapper< WuzifenleiEntity> ew = new EntityWrapper< WuzifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wuzifenlei, "wuzifenlei")); 
		WuzifenleiView wuzifenleiView =  wuzifenleiService.selectView(ew);
		return R.ok("查询物资分类成功").put("data", wuzifenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WuzifenleiEntity wuzifenlei = wuzifenleiService.selectById(id);
        return R.ok().put("data", wuzifenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WuzifenleiEntity wuzifenlei = wuzifenleiService.selectById(id);
        return R.ok().put("data", wuzifenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WuzifenleiEntity wuzifenlei, HttpServletRequest request){
    	wuzifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzifenlei);
        wuzifenleiService.insert(wuzifenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WuzifenleiEntity wuzifenlei, HttpServletRequest request){
    	wuzifenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzifenlei);
        wuzifenleiService.insert(wuzifenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WuzifenleiEntity wuzifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wuzifenlei);
        wuzifenleiService.updateById(wuzifenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wuzifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
