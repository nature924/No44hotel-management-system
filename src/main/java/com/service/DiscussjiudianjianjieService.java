package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiudianjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiudianjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiudianjianjieView;


/**
 * 酒店简介评论表
 *
 * @author 
 * @email 
 * @date 2022-04-04 00:20:05
 */
public interface DiscussjiudianjianjieService extends IService<DiscussjiudianjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiudianjianjieVO> selectListVO(Wrapper<DiscussjiudianjianjieEntity> wrapper);
   	
   	DiscussjiudianjianjieVO selectVO(@Param("ew") Wrapper<DiscussjiudianjianjieEntity> wrapper);
   	
   	List<DiscussjiudianjianjieView> selectListView(Wrapper<DiscussjiudianjianjieEntity> wrapper);
   	
   	DiscussjiudianjianjieView selectView(@Param("ew") Wrapper<DiscussjiudianjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiudianjianjieEntity> wrapper);
   	

}

