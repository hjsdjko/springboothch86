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


import com.dao.ToujianxinxiDao;
import com.entity.ToujianxinxiEntity;
import com.service.ToujianxinxiService;
import com.entity.vo.ToujianxinxiVO;
import com.entity.view.ToujianxinxiView;

@Service("toujianxinxiService")
public class ToujianxinxiServiceImpl extends ServiceImpl<ToujianxinxiDao, ToujianxinxiEntity> implements ToujianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToujianxinxiEntity> page = this.selectPage(
                new Query<ToujianxinxiEntity>(params).getPage(),
                new EntityWrapper<ToujianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToujianxinxiEntity> wrapper) {
		  Page<ToujianxinxiView> page =new Query<ToujianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ToujianxinxiVO> selectListVO(Wrapper<ToujianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ToujianxinxiVO selectVO(Wrapper<ToujianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ToujianxinxiView> selectListView(Wrapper<ToujianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToujianxinxiView selectView(Wrapper<ToujianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
