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

import com.entity.WuzirukuEntity;
import com.entity.view.WuzirukuView;

import com.service.WuzirukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 物资入库
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/wuziruku")
public class WuzirukuController {
    @Autowired
    private WuzirukuService wuzirukuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WuzirukuEntity wuziruku,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukuriqiend,
		HttpServletRequest request){
        EntityWrapper<WuzirukuEntity> ew = new EntityWrapper<WuzirukuEntity>();
                if(rukuriqistart!=null) ew.ge("rukuriqi", rukuriqistart);
                if(rukuriqiend!=null) ew.le("rukuriqi", rukuriqiend);

		PageUtils page = wuzirukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuziruku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WuzirukuEntity wuziruku, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rukuriqiend,
		HttpServletRequest request){
        EntityWrapper<WuzirukuEntity> ew = new EntityWrapper<WuzirukuEntity>();
                if(rukuriqistart!=null) ew.ge("rukuriqi", rukuriqistart);
                if(rukuriqiend!=null) ew.le("rukuriqi", rukuriqiend);

		PageUtils page = wuzirukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuziruku), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WuzirukuEntity wuziruku){
       	EntityWrapper<WuzirukuEntity> ew = new EntityWrapper<WuzirukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wuziruku, "wuziruku")); 
        return R.ok().put("data", wuzirukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WuzirukuEntity wuziruku){
        EntityWrapper< WuzirukuEntity> ew = new EntityWrapper< WuzirukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wuziruku, "wuziruku")); 
		WuzirukuView wuzirukuView =  wuzirukuService.selectView(ew);
		return R.ok("查询物资入库成功").put("data", wuzirukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WuzirukuEntity wuziruku = wuzirukuService.selectById(id);
        return R.ok().put("data", wuziruku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WuzirukuEntity wuziruku = wuzirukuService.selectById(id);
        return R.ok().put("data", wuziruku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WuzirukuEntity wuziruku, HttpServletRequest request){
    	wuziruku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuziruku);
        wuzirukuService.insert(wuziruku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WuzirukuEntity wuziruku, HttpServletRequest request){
    	wuziruku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuziruku);
        wuzirukuService.insert(wuziruku);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WuzirukuEntity wuziruku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wuziruku);
        wuzirukuService.updateById(wuziruku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wuzirukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
