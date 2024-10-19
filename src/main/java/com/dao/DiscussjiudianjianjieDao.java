package com.dao;

import com.entity.DiscussjiudianjianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiudianjianjieVO;
import com.entity.view.DiscussjiudianjianjieView;


/**
 * 酒店简介评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-04 00:20:05
 */
public interface DiscussjiudianjianjieDao extends BaseMapper<DiscussjiudianjianjieEntity> {
	
	List<DiscussjiudianjianjieVO> selectListVO(@Param("ew") Wrapper<DiscussjiudianjianjieEntity> wrapper);
	
	DiscussjiudianjianjieVO selectVO(@Param("ew") Wrapper<DiscussjiudianjianjieEntity> wrapper);
	
	List<DiscussjiudianjianjieView> selectListView(@Param("ew") Wrapper<DiscussjiudianjianjieEntity> wrapper);

	List<DiscussjiudianjianjieView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiudianjianjieEntity> wrapper);
	
	DiscussjiudianjianjieView selectView(@Param("ew") Wrapper<DiscussjiudianjianjieEntity> wrapper);
	

}
