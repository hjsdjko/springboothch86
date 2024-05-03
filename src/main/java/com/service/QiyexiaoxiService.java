package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyexiaoxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyexiaoxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyexiaoxiView;


/**
 * 企业消息
 *
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface QiyexiaoxiService extends IService<QiyexiaoxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyexiaoxiVO> selectListVO(Wrapper<QiyexiaoxiEntity> wrapper);
   	
   	QiyexiaoxiVO selectVO(@Param("ew") Wrapper<QiyexiaoxiEntity> wrapper);
   	
   	List<QiyexiaoxiView> selectListView(Wrapper<QiyexiaoxiEntity> wrapper);
   	
   	QiyexiaoxiView selectView(@Param("ew") Wrapper<QiyexiaoxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyexiaoxiEntity> wrapper);
   	

}

