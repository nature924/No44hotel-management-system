package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KefangyudingDao;
import com.entity.KefangyudingEntity;
import com.service.KefangyudingService;
import com.entity.vo.KefangyudingVO;
import com.entity.view.KefangyudingView;

@Service("kefangyudingService")
public class KefangyudingServiceImpl extends ServiceImpl<KefangyudingDao, KefangyudingEntity> implements KefangyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangyudingEntity> page = this.selectPage(
                new Query<KefangyudingEntity>(params).getPage(),
                new EntityWrapper<KefangyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangyudingEntity> wrapper) {
		  Page<KefangyudingView> page =new Query<KefangyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangyudingVO> selectListVO(Wrapper<KefangyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangyudingVO selectVO(Wrapper<KefangyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangyudingView> selectListView(Wrapper<KefangyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangyudingView selectView(Wrapper<KefangyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
