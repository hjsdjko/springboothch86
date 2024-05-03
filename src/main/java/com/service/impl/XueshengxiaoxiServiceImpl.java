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


import com.dao.XueshengxiaoxiDao;
import com.entity.XueshengxiaoxiEntity;
import com.service.XueshengxiaoxiService;
import com.entity.vo.XueshengxiaoxiVO;
import com.entity.view.XueshengxiaoxiView;

@Service("xueshengxiaoxiService")
public class XueshengxiaoxiServiceImpl extends ServiceImpl<XueshengxiaoxiDao, XueshengxiaoxiEntity> implements XueshengxiaoxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxiaoxiEntity> page = this.selectPage(
                new Query<XueshengxiaoxiEntity>(params).getPage(),
                new EntityWrapper<XueshengxiaoxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxiaoxiEntity> wrapper) {
		  Page<XueshengxiaoxiView> page =new Query<XueshengxiaoxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxiaoxiVO> selectListVO(Wrapper<XueshengxiaoxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxiaoxiVO selectVO(Wrapper<XueshengxiaoxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxiaoxiView> selectListView(Wrapper<XueshengxiaoxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxiaoxiView selectView(Wrapper<XueshengxiaoxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
