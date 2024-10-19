package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangleixingView;


/**
 * 客房类型
 *
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
public interface KefangleixingService extends IService<KefangleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangleixingVO> selectListVO(Wrapper<KefangleixingEntity> wrapper);
   	
   	KefangleixingVO selectVO(@Param("ew") Wrapper<KefangleixingEntity> wrapper);
   	
   	List<KefangleixingView> selectListView(Wrapper<KefangleixingEntity> wrapper);
   	
   	KefangleixingView selectView(@Param("ew") Wrapper<KefangleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangleixingEntity> wrapper);
   	

}

