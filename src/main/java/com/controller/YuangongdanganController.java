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

import com.entity.YuangongdanganEntity;
import com.entity.view.YuangongdanganView;

import com.service.YuangongdanganService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 员工档案
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-04 22:15:40
 */
@RestController
@RequestMapping("/yuangongdangan")
public class YuangongdanganController {
    @Autowired
    private YuangongdanganService yuangongdanganService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuangongdanganEntity yuangongdangan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yihurenyuan")) {
			yuangongdangan.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuangongdanganEntity> ew = new EntityWrapper<YuangongdanganEntity>();

		PageUtils page = yuangongdanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongdangan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuangongdanganEntity yuangongdangan, 
		HttpServletRequest request){
        EntityWrapper<YuangongdanganEntity> ew = new EntityWrapper<YuangongdanganEntity>();

		PageUtils page = yuangongdanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongdangan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuangongdanganEntity yuangongdangan){
       	EntityWrapper<YuangongdanganEntity> ew = new EntityWrapper<YuangongdanganEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuangongdangan, "yuangongdangan")); 
        return R.ok().put("data", yuangongdanganService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuangongdanganEntity yuangongdangan){
        EntityWrapper< YuangongdanganEntity> ew = new EntityWrapper< YuangongdanganEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuangongdangan, "yuangongdangan")); 
		YuangongdanganView yuangongdanganView =  yuangongdanganService.selectView(ew);
		return R.ok("查询员工档案成功").put("data", yuangongdanganView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuangongdanganEntity yuangongdangan = yuangongdanganService.selectById(id);
        return R.ok().put("data", yuangongdangan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuangongdanganEntity yuangongdangan = yuangongdanganService.selectById(id);
        return R.ok().put("data", yuangongdangan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuangongdanganEntity yuangongdangan, HttpServletRequest request){
    	yuangongdangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongdangan);
        yuangongdanganService.insert(yuangongdangan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuangongdanganEntity yuangongdangan, HttpServletRequest request){
    	yuangongdangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongdangan);
        yuangongdanganService.insert(yuangongdangan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuangongdanganEntity yuangongdangan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuangongdangan);
        yuangongdanganService.updateById(yuangongdangan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuangongdanganService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
