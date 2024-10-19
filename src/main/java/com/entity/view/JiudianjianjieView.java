package com.entity.view;

import com.entity.JiudianjianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店简介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
@TableName("jiudianjianjie")
public class JiudianjianjieView  extends JiudianjianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudianjianjieView(){
	}
 
 	public JiudianjianjieView(JiudianjianjieEntity jiudianjianjieEntity){
 	try {
			BeanUtils.copyProperties(this, jiudianjianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
