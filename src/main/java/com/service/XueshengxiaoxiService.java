package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxiaoxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxiaoxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxiaoxiView;


/**
 * 学生消息
 *
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface XueshengxiaoxiService extends IService<XueshengxiaoxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxiaoxiVO> selectListVO(Wrapper<XueshengxiaoxiEntity> wrapper);
   	
   	XueshengxiaoxiVO selectVO(@Param("ew") Wrapper<XueshengxiaoxiEntity> wrapper);
   	
   	List<XueshengxiaoxiView> selectListView(Wrapper<XueshengxiaoxiEntity> wrapper);
   	
   	XueshengxiaoxiView selectView(@Param("ew") Wrapper<XueshengxiaoxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxiaoxiEntity> wrapper);
   	

}

