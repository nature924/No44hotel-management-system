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


import com.dao.RuzhuanpaiDao;
import com.entity.RuzhuanpaiEntity;
import com.service.RuzhuanpaiService;
import com.entity.vo.RuzhuanpaiVO;
import com.entity.view.RuzhuanpaiView;

@Service("ruzhuanpaiService")
public class RuzhuanpaiServiceImpl extends ServiceImpl<RuzhuanpaiDao, RuzhuanpaiEntity> implements RuzhuanpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhuanpaiEntity> page = this.selectPage(
                new Query<RuzhuanpaiEntity>(params).getPage(),
                new EntityWrapper<RuzhuanpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhuanpaiEntity> wrapper) {
		  Page<RuzhuanpaiView> page =new Query<RuzhuanpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuzhuanpaiVO> selectListVO(Wrapper<RuzhuanpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuzhuanpaiVO selectVO(Wrapper<RuzhuanpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuzhuanpaiView> selectListView(Wrapper<RuzhuanpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhuanpaiView selectView(Wrapper<RuzhuanpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
