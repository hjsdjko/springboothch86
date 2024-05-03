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


import com.dao.QiyezhaopinDao;
import com.entity.QiyezhaopinEntity;
import com.service.QiyezhaopinService;
import com.entity.vo.QiyezhaopinVO;
import com.entity.view.QiyezhaopinView;

@Service("qiyezhaopinService")
public class QiyezhaopinServiceImpl extends ServiceImpl<QiyezhaopinDao, QiyezhaopinEntity> implements QiyezhaopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyezhaopinEntity> page = this.selectPage(
                new Query<QiyezhaopinEntity>(params).getPage(),
                new EntityWrapper<QiyezhaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyezhaopinEntity> wrapper) {
		  Page<QiyezhaopinView> page =new Query<QiyezhaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyezhaopinVO> selectListVO(Wrapper<QiyezhaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyezhaopinVO selectVO(Wrapper<QiyezhaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyezhaopinView> selectListView(Wrapper<QiyezhaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyezhaopinView selectView(Wrapper<QiyezhaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
