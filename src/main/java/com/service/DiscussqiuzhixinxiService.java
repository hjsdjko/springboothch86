package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiuzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiuzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiuzhixinxiView;


/**
 * 求职信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface DiscussqiuzhixinxiService extends IService<DiscussqiuzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiuzhixinxiVO> selectListVO(Wrapper<DiscussqiuzhixinxiEntity> wrapper);
   	
   	DiscussqiuzhixinxiVO selectVO(@Param("ew") Wrapper<DiscussqiuzhixinxiEntity> wrapper);
   	
   	List<DiscussqiuzhixinxiView> selectListView(Wrapper<DiscussqiuzhixinxiEntity> wrapper);
   	
   	DiscussqiuzhixinxiView selectView(@Param("ew") Wrapper<DiscussqiuzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiuzhixinxiEntity> wrapper);
   	

}

