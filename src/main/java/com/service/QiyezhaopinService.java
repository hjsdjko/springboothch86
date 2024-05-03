package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyezhaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyezhaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyezhaopinView;


/**
 * 企业招聘
 *
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public interface QiyezhaopinService extends IService<QiyezhaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyezhaopinVO> selectListVO(Wrapper<QiyezhaopinEntity> wrapper);
   	
   	QiyezhaopinVO selectVO(@Param("ew") Wrapper<QiyezhaopinEntity> wrapper);
   	
   	List<QiyezhaopinView> selectListView(Wrapper<QiyezhaopinEntity> wrapper);
   	
   	QiyezhaopinView selectView(@Param("ew") Wrapper<QiyezhaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyezhaopinEntity> wrapper);
   	

}

