package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuoleixingView;


/**
 * 工作类型
 *
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface GongzuoleixingService extends IService<GongzuoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuoleixingVO> selectListVO(Wrapper<GongzuoleixingEntity> wrapper);
   	
   	GongzuoleixingVO selectVO(@Param("ew") Wrapper<GongzuoleixingEntity> wrapper);
   	
   	List<GongzuoleixingView> selectListView(Wrapper<GongzuoleixingEntity> wrapper);
   	
   	GongzuoleixingView selectView(@Param("ew") Wrapper<GongzuoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuoleixingEntity> wrapper);
   	

}

