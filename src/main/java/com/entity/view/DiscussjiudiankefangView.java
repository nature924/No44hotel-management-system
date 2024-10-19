package com.entity.view;

import com.entity.DiscussjiudiankefangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店客房评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 00:20:05
 */
@TableName("discussjiudiankefang")
public class DiscussjiudiankefangView  extends DiscussjiudiankefangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiudiankefangView(){
	}
 
 	public DiscussjiudiankefangView(DiscussjiudiankefangEntity discussjiudiankefangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiudiankefangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
