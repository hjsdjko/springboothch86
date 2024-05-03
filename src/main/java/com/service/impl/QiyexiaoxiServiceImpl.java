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


import com.dao.QiyexiaoxiDao;
import com.entity.QiyexiaoxiEntity;
import com.service.QiyexiaoxiService;
import com.entity.vo.QiyexiaoxiVO;
import com.entity.view.QiyexiaoxiView;

@Service("qiyexiaoxiService")
public class QiyexiaoxiServiceImpl extends ServiceImpl<QiyexiaoxiDao, QiyexiaoxiEntity> implements QiyexiaoxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyexiaoxiEntity> page = this.selectPage(
                new Query<QiyexiaoxiEntity>(params).getPage(),
                new EntityWrapper<QiyexiaoxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyexiaoxiEntity> wrapper) {
		  Page<QiyexiaoxiView> page =new Query<QiyexiaoxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyexiaoxiVO> selectListVO(Wrapper<QiyexiaoxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyexiaoxiVO selectVO(Wrapper<QiyexiaoxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyexiaoxiView> selectListView(Wrapper<QiyexiaoxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyexiaoxiView selectView(Wrapper<QiyexiaoxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
