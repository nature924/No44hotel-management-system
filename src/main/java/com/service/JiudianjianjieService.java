package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianjianjieView;


/**
 * 酒店简介
 *
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
public interface JiudianjianjieService extends IService<JiudianjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianjianjieVO> selectListVO(Wrapper<JiudianjianjieEntity> wrapper);
   	
   	JiudianjianjieVO selectVO(@Param("ew") Wrapper<JiudianjianjieEntity> wrapper);
   	
   	List<JiudianjianjieView> selectListView(Wrapper<JiudianjianjieEntity> wrapper);
   	
   	JiudianjianjieView selectView(@Param("ew") Wrapper<JiudianjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianjianjieEntity> wrapper);
   	

}

