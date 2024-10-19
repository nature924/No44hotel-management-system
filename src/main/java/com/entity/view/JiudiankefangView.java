package com.entity.view;

import com.entity.JiudiankefangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店客房
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
@TableName("jiudiankefang")
public class JiudiankefangView  extends JiudiankefangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudiankefangView(){
	}
 
 	public JiudiankefangView(JiudiankefangEntity jiudiankefangEntity){
 	try {
			BeanUtils.copyProperties(this, jiudiankefangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
