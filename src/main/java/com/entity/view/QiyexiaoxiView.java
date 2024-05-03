package com.entity.view;

import com.entity.QiyexiaoxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业消息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
@TableName("qiyexiaoxi")
public class QiyexiaoxiView  extends QiyexiaoxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyexiaoxiView(){
	}
 
 	public QiyexiaoxiView(QiyexiaoxiEntity qiyexiaoxiEntity){
 	try {
			BeanUtils.copyProperties(this, qiyexiaoxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
