package com.entity.view;

import com.entity.KefangyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客房预定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
@TableName("kefangyuding")
public class KefangyudingView  extends KefangyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KefangyudingView(){
	}
 
 	public KefangyudingView(KefangyudingEntity kefangyudingEntity){
 	try {
			BeanUtils.copyProperties(this, kefangyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
