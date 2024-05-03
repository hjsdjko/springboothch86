package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiyezhaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiyezhaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiyezhaopinView;


/**
 * 企业招聘评论表
 *
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface DiscussqiyezhaopinService extends IService<DiscussqiyezhaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiyezhaopinVO> selectListVO(Wrapper<DiscussqiyezhaopinEntity> wrapper);
   	
   	DiscussqiyezhaopinVO selectVO(@Param("ew") Wrapper<DiscussqiyezhaopinEntity> wrapper);
   	
   	List<DiscussqiyezhaopinView> selectListView(Wrapper<DiscussqiyezhaopinEntity> wrapper);
   	
   	DiscussqiyezhaopinView selectView(@Param("ew") Wrapper<DiscussqiyezhaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiyezhaopinEntity> wrapper);
   	

}

