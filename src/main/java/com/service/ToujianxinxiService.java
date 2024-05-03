package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToujianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToujianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToujianxinxiView;


/**
 * 投简信息
 *
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface ToujianxinxiService extends IService<ToujianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToujianxinxiVO> selectListVO(Wrapper<ToujianxinxiEntity> wrapper);
   	
   	ToujianxinxiVO selectVO(@Param("ew") Wrapper<ToujianxinxiEntity> wrapper);
   	
   	List<ToujianxinxiView> selectListView(Wrapper<ToujianxinxiEntity> wrapper);
   	
   	ToujianxinxiView selectView(@Param("ew") Wrapper<ToujianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToujianxinxiEntity> wrapper);
   	

}

