package com.dao;

import com.entity.XueshengxiaoxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxiaoxiVO;
import com.entity.view.XueshengxiaoxiView;


/**
 * 学生消息
 * 
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface XueshengxiaoxiDao extends BaseMapper<XueshengxiaoxiEntity> {
	
	List<XueshengxiaoxiVO> selectListVO(@Param("ew") Wrapper<XueshengxiaoxiEntity> wrapper);
	
	XueshengxiaoxiVO selectVO(@Param("ew") Wrapper<XueshengxiaoxiEntity> wrapper);
	
	List<XueshengxiaoxiView> selectListView(@Param("ew") Wrapper<XueshengxiaoxiEntity> wrapper);

	List<XueshengxiaoxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxiaoxiEntity> wrapper);
	
	XueshengxiaoxiView selectView(@Param("ew") Wrapper<XueshengxiaoxiEntity> wrapper);
	

}
