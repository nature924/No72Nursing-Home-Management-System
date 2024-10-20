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

import com.entity.FuwugongdanEntity;
import com.entity.view.FuwugongdanView;

import com.service.FuwugongdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 服务工单
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/fuwugongdan")
public class FuwugongdanController {
    @Autowired
    private FuwugongdanService fuwugongdanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwugongdanEntity fuwugongdan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yihurenyuan")) {
			fuwugongdan.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("laoren")) {
			fuwugongdan.setLaorenbianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FuwugongdanEntity> ew = new EntityWrapper<FuwugongdanEntity>();

		PageUtils page = fuwugongdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwugongdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwugongdanEntity fuwugongdan, 
		HttpServletRequest request){
        EntityWrapper<FuwugongdanEntity> ew = new EntityWrapper<FuwugongdanEntity>();

		PageUtils page = fuwugongdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwugongdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwugongdanEntity fuwugongdan){
       	EntityWrapper<FuwugongdanEntity> ew = new EntityWrapper<FuwugongdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwugongdan, "fuwugongdan")); 
        return R.ok().put("data", fuwugongdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwugongdanEntity fuwugongdan){
        EntityWrapper< FuwugongdanEntity> ew = new EntityWrapper< FuwugongdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwugongdan, "fuwugongdan")); 
		FuwugongdanView fuwugongdanView =  fuwugongdanService.selectView(ew);
		return R.ok("查询服务工单成功").put("data", fuwugongdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwugongdanEntity fuwugongdan = fuwugongdanService.selectById(id);
        return R.ok().put("data", fuwugongdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwugongdanEntity fuwugongdan = fuwugongdanService.selectById(id);
        return R.ok().put("data", fuwugongdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwugongdanEntity fuwugongdan, HttpServletRequest request){
    	fuwugongdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwugongdan);
        fuwugongdanService.insert(fuwugongdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwugongdanEntity fuwugongdan, HttpServletRequest request){
    	fuwugongdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwugongdan);
        fuwugongdanService.insert(fuwugongdan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuwugongdanEntity fuwugongdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwugongdan);
        fuwugongdanService.updateById(fuwugongdan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwugongdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
