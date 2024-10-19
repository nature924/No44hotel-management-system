package com.dao;

import com.entity.DiscussjiudiankefangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiudiankefangVO;
import com.entity.view.DiscussjiudiankefangView;


/**
 * 酒店客房评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-04 00:20:05
 */
public interface DiscussjiudiankefangDao extends BaseMapper<DiscussjiudiankefangEntity> {
	
	List<DiscussjiudiankefangVO> selectListVO(@Param("ew") Wrapper<DiscussjiudiankefangEntity> wrapper);
	
	DiscussjiudiankefangVO selectVO(@Param("ew") Wrapper<DiscussjiudiankefangEntity> wrapper);
	
	List<DiscussjiudiankefangView> selectListView(@Param("ew") Wrapper<DiscussjiudiankefangEntity> wrapper);

	List<DiscussjiudiankefangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiudiankefangEntity> wrapper);
	
	DiscussjiudiankefangView selectView(@Param("ew") Wrapper<DiscussjiudiankefangEntity> wrapper);
	

}
