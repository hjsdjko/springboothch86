package com.dao;

import com.entity.GongzuoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuoleixingVO;
import com.entity.view.GongzuoleixingView;


/**
 * 工作类型
 * 
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface GongzuoleixingDao extends BaseMapper<GongzuoleixingEntity> {
	
	List<GongzuoleixingVO> selectListVO(@Param("ew") Wrapper<GongzuoleixingEntity> wrapper);
	
	GongzuoleixingVO selectVO(@Param("ew") Wrapper<GongzuoleixingEntity> wrapper);
	
	List<GongzuoleixingView> selectListView(@Param("ew") Wrapper<GongzuoleixingEntity> wrapper);

	List<GongzuoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuoleixingEntity> wrapper);
	
	GongzuoleixingView selectView(@Param("ew") Wrapper<GongzuoleixingEntity> wrapper);
	

}
