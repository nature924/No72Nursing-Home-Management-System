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

import com.entity.HulifengxianEntity;
import com.entity.view.HulifengxianView;

import com.service.HulifengxianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 护理风险
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/hulifengxian")
public class HulifengxianController {
    @Autowired
    private HulifengxianService hulifengxianService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HulifengxianEntity hulifengxian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoren")) {
			hulifengxian.setLaorenbianhao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			hulifengxian.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HulifengxianEntity> ew = new EntityWrapper<HulifengxianEntity>();

		PageUtils page = hulifengxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hulifengxian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HulifengxianEntity hulifengxian, 
		HttpServletRequest request){
        EntityWrapper<HulifengxianEntity> ew = new EntityWrapper<HulifengxianEntity>();

		PageUtils page = hulifengxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hulifengxian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HulifengxianEntity hulifengxian){
       	EntityWrapper<HulifengxianEntity> ew = new EntityWrapper<HulifengxianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hulifengxian, "hulifengxian")); 
        return R.ok().put("data", hulifengxianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HulifengxianEntity hulifengxian){
        EntityWrapper< HulifengxianEntity> ew = new EntityWrapper< HulifengxianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hulifengxian, "hulifengxian")); 
		HulifengxianView hulifengxianView =  hulifengxianService.selectView(ew);
		return R.ok("查询护理风险成功").put("data", hulifengxianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HulifengxianEntity hulifengxian = hulifengxianService.selectById(id);
        return R.ok().put("data", hulifengxian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HulifengxianEntity hulifengxian = hulifengxianService.selectById(id);
        return R.ok().put("data", hulifengxian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HulifengxianEntity hulifengxian, HttpServletRequest request){
    	hulifengxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hulifengxian);
        hulifengxianService.insert(hulifengxian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HulifengxianEntity hulifengxian, HttpServletRequest request){
    	hulifengxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hulifengxian);
        hulifengxianService.insert(hulifengxian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HulifengxianEntity hulifengxian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hulifengxian);
        hulifengxianService.updateById(hulifengxian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hulifengxianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
