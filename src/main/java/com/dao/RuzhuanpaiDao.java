package com.dao;

import com.entity.RuzhuanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuzhuanpaiVO;
import com.entity.view.RuzhuanpaiView;


/**
 * 入住安排
 * 
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
public interface RuzhuanpaiDao extends BaseMapper<RuzhuanpaiEntity> {
	
	List<RuzhuanpaiVO> selectListVO(@Param("ew") Wrapper<RuzhuanpaiEntity> wrapper);
	
	RuzhuanpaiVO selectVO(@Param("ew") Wrapper<RuzhuanpaiEntity> wrapper);
	
	List<RuzhuanpaiView> selectListView(@Param("ew") Wrapper<RuzhuanpaiEntity> wrapper);

	List<RuzhuanpaiView> selectListView(Pagination page,@Param("ew") Wrapper<RuzhuanpaiEntity> wrapper);
	
	RuzhuanpaiView selectView(@Param("ew") Wrapper<RuzhuanpaiEntity> wrapper);
	

}
