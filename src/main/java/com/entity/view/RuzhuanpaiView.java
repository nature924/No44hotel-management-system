package com.entity.view;

import com.entity.RuzhuanpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入住安排
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
@TableName("ruzhuanpai")
public class RuzhuanpaiView  extends RuzhuanpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuzhuanpaiView(){
	}
 
 	public RuzhuanpaiView(RuzhuanpaiEntity ruzhuanpaiEntity){
 	try {
			BeanUtils.copyProperties(this, ruzhuanpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
