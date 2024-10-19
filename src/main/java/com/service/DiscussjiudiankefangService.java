package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiudiankefangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiudiankefangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiudiankefangView;


/**
 * 酒店客房评论表
 *
 * @author 
 * @email 
 * @date 2022-04-04 00:20:05
 */
public interface DiscussjiudiankefangService extends IService<DiscussjiudiankefangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiudiankefangVO> selectListVO(Wrapper<DiscussjiudiankefangEntity> wrapper);
   	
   	DiscussjiudiankefangVO selectVO(@Param("ew") Wrapper<DiscussjiudiankefangEntity> wrapper);
   	
   	List<DiscussjiudiankefangView> selectListView(Wrapper<DiscussjiudiankefangEntity> wrapper);
   	
   	DiscussjiudiankefangView selectView(@Param("ew") Wrapper<DiscussjiudiankefangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiudiankefangEntity> wrapper);
   	

}

