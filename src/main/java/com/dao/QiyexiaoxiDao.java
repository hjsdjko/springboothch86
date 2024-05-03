package com.dao;

import com.entity.QiyexiaoxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyexiaoxiVO;
import com.entity.view.QiyexiaoxiView;


/**
 * 企业消息
 * 
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface QiyexiaoxiDao extends BaseMapper<QiyexiaoxiEntity> {
	
	List<QiyexiaoxiVO> selectListVO(@Param("ew") Wrapper<QiyexiaoxiEntity> wrapper);
	
	QiyexiaoxiVO selectVO(@Param("ew") Wrapper<QiyexiaoxiEntity> wrapper);
	
	List<QiyexiaoxiView> selectListView(@Param("ew") Wrapper<QiyexiaoxiEntity> wrapper);

	List<QiyexiaoxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiyexiaoxiEntity> wrapper);
	
	QiyexiaoxiView selectView(@Param("ew") Wrapper<QiyexiaoxiEntity> wrapper);
	

}
