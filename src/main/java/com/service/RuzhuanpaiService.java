package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuzhuanpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuzhuanpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuzhuanpaiView;


/**
 * 入住安排
 *
 * @author 
 * @email 
 * @date 2022-04-04 00:20:04
 */
public interface RuzhuanpaiService extends IService<RuzhuanpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuzhuanpaiVO> selectListVO(Wrapper<RuzhuanpaiEntity> wrapper);
   	
   	RuzhuanpaiVO selectVO(@Param("ew") Wrapper<RuzhuanpaiEntity> wrapper);
   	
   	List<RuzhuanpaiView> selectListView(Wrapper<RuzhuanpaiEntity> wrapper);
   	
   	RuzhuanpaiView selectView(@Param("ew") Wrapper<RuzhuanpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuzhuanpaiEntity> wrapper);
   	

}

