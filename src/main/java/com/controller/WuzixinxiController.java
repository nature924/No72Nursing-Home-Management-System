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

import com.entity.WuzixinxiEntity;
import com.entity.view.WuzixinxiView;

import com.service.WuzixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 物资信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/wuzixinxi")
public class WuzixinxiController {
    @Autowired
    private WuzixinxiService wuzixinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WuzixinxiEntity wuzixinxi,
		HttpServletRequest request){
        EntityWrapper<WuzixinxiEntity> ew = new EntityWrapper<WuzixinxiEntity>();

		PageUtils page = wuzixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WuzixinxiEntity wuzixinxi, 
		HttpServletRequest request){
        EntityWrapper<WuzixinxiEntity> ew = new EntityWrapper<WuzixinxiEntity>();

		PageUtils page = wuzixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuzixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WuzixinxiEntity wuzixinxi){
       	EntityWrapper<WuzixinxiEntity> ew = new EntityWrapper<WuzixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wuzixinxi, "wuzixinxi")); 
        return R.ok().put("data", wuzixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WuzixinxiEntity wuzixinxi){
        EntityWrapper< WuzixinxiEntity> ew = new EntityWrapper< WuzixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wuzixinxi, "wuzixinxi")); 
		WuzixinxiView wuzixinxiView =  wuzixinxiService.selectView(ew);
		return R.ok("查询物资信息成功").put("data", wuzixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WuzixinxiEntity wuzixinxi = wuzixinxiService.selectById(id);
        return R.ok().put("data", wuzixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WuzixinxiEntity wuzixinxi = wuzixinxiService.selectById(id);
        return R.ok().put("data", wuzixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WuzixinxiEntity wuzixinxi, HttpServletRequest request){
    	wuzixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzixinxi);
        wuzixinxiService.insert(wuzixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody WuzixinxiEntity wuzixinxi, HttpServletRequest request){
    	wuzixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuzixinxi);
        wuzixinxiService.insert(wuzixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WuzixinxiEntity wuzixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wuzixinxi);
        wuzixinxiService.updateById(wuzixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wuzixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
