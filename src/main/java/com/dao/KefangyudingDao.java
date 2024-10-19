package com.dao;

import com.entity.KefangyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangyudingVO;
import com.entity.view.KefangyudingView;


/**
 * 客房预定
 * 
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
public interface KefangyudingDao extends BaseMapper<KefangyudingEntity> {
	
	List<KefangyudingVO> selectListVO(@Param("ew") Wrapper<KefangyudingEntity> wrapper);
	
	KefangyudingVO selectVO(@Param("ew") Wrapper<KefangyudingEntity> wrapper);
	
	List<KefangyudingView> selectListView(@Param("ew") Wrapper<KefangyudingEntity> wrapper);

	List<KefangyudingView> selectListView(Pagination page,@Param("ew") Wrapper<KefangyudingEntity> wrapper);
	
	KefangyudingView selectView(@Param("ew") Wrapper<KefangyudingEntity> wrapper);
	

}
