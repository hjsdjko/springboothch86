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


import com.dao.GongzuoleixingDao;
import com.entity.GongzuoleixingEntity;
import com.service.GongzuoleixingService;
import com.entity.vo.GongzuoleixingVO;
import com.entity.view.GongzuoleixingView;

@Service("gongzuoleixingService")
public class GongzuoleixingServiceImpl extends ServiceImpl<GongzuoleixingDao, GongzuoleixingEntity> implements GongzuoleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuoleixingEntity> page = this.selectPage(
                new Query<GongzuoleixingEntity>(params).getPage(),
                new EntityWrapper<GongzuoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuoleixingEntity> wrapper) {
		  Page<GongzuoleixingView> page =new Query<GongzuoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuoleixingVO> selectListVO(Wrapper<GongzuoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuoleixingVO selectVO(Wrapper<GongzuoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuoleixingView> selectListView(Wrapper<GongzuoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuoleixingView selectView(Wrapper<GongzuoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
