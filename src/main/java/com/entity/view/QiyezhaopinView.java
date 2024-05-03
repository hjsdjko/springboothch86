package com.entity.view;

import com.entity.QiyezhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业招聘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
@TableName("qiyezhaopin")
public class QiyezhaopinView  extends QiyezhaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyezhaopinView(){
	}
 
 	public QiyezhaopinView(QiyezhaopinEntity qiyezhaopinEntity){
 	try {
			BeanUtils.copyProperties(this, qiyezhaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
