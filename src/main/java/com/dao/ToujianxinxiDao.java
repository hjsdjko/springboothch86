package com.dao;

import com.entity.ToujianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToujianxinxiVO;
import com.entity.view.ToujianxinxiView;


/**
 * 投简信息
 * 
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface ToujianxinxiDao extends BaseMapper<ToujianxinxiEntity> {
	
	List<ToujianxinxiVO> selectListVO(@Param("ew") Wrapper<ToujianxinxiEntity> wrapper);
	
	ToujianxinxiVO selectVO(@Param("ew") Wrapper<ToujianxinxiEntity> wrapper);
	
	List<ToujianxinxiView> selectListView(@Param("ew") Wrapper<ToujianxinxiEntity> wrapper);

	List<ToujianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ToujianxinxiEntity> wrapper);
	
	ToujianxinxiView selectView(@Param("ew") Wrapper<ToujianxinxiEntity> wrapper);
	

}
