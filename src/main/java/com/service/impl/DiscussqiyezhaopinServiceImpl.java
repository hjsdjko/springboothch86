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


import com.dao.DiscussqiyezhaopinDao;
import com.entity.DiscussqiyezhaopinEntity;
import com.service.DiscussqiyezhaopinService;
import com.entity.vo.DiscussqiyezhaopinVO;
import com.entity.view.DiscussqiyezhaopinView;

@Service("discussqiyezhaopinService")
public class DiscussqiyezhaopinServiceImpl extends ServiceImpl<DiscussqiyezhaopinDao, DiscussqiyezhaopinEntity> implements DiscussqiyezhaopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiyezhaopinEntity> page = this.selectPage(
                new Query<DiscussqiyezhaopinEntity>(params).getPage(),
                new EntityWrapper<DiscussqiyezhaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiyezhaopinEntity> wrapper) {
		  Page<DiscussqiyezhaopinView> page =new Query<DiscussqiyezhaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiyezhaopinVO> selectListVO(Wrapper<DiscussqiyezhaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiyezhaopinVO selectVO(Wrapper<DiscussqiyezhaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiyezhaopinView> selectListView(Wrapper<DiscussqiyezhaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiyezhaopinView selectView(Wrapper<DiscussqiyezhaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
