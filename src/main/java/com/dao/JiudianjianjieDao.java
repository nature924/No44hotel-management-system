package com.dao;

import com.entity.JiudianjianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianjianjieVO;
import com.entity.view.JiudianjianjieView;


/**
 * 酒店简介
 * 
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
public interface JiudianjianjieDao extends BaseMapper<JiudianjianjieEntity> {
	
	List<JiudianjianjieVO> selectListVO(@Param("ew") Wrapper<JiudianjianjieEntity> wrapper);
	
	JiudianjianjieVO selectVO(@Param("ew") Wrapper<JiudianjianjieEntity> wrapper);
	
	List<JiudianjianjieView> selectListView(@Param("ew") Wrapper<JiudianjianjieEntity> wrapper);

	List<JiudianjianjieView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianjianjieEntity> wrapper);
	
	JiudianjianjieView selectView(@Param("ew") Wrapper<JiudianjianjieEntity> wrapper);
	

}
