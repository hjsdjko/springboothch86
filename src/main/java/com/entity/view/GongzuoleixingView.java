package com.entity.view;

import com.entity.GongzuoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工作类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
@TableName("gongzuoleixing")
public class GongzuoleixingView  extends GongzuoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuoleixingView(){
	}
 
 	public GongzuoleixingView(GongzuoleixingEntity gongzuoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
