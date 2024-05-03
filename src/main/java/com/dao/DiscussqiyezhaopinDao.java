package com.dao;

import com.entity.DiscussqiyezhaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiyezhaopinVO;
import com.entity.view.DiscussqiyezhaopinView;


/**
 * 企业招聘评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface DiscussqiyezhaopinDao extends BaseMapper<DiscussqiyezhaopinEntity> {
	
	List<DiscussqiyezhaopinVO> selectListVO(@Param("ew") Wrapper<DiscussqiyezhaopinEntity> wrapper);
	
	DiscussqiyezhaopinVO selectVO(@Param("ew") Wrapper<DiscussqiyezhaopinEntity> wrapper);
	
	List<DiscussqiyezhaopinView> selectListView(@Param("ew") Wrapper<DiscussqiyezhaopinEntity> wrapper);

	List<DiscussqiyezhaopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiyezhaopinEntity> wrapper);
	
	DiscussqiyezhaopinView selectView(@Param("ew") Wrapper<DiscussqiyezhaopinEntity> wrapper);
	

}
