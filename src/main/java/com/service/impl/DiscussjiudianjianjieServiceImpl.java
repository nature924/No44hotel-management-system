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


import com.dao.DiscussjiudianjianjieDao;
import com.entity.DiscussjiudianjianjieEntity;
import com.service.DiscussjiudianjianjieService;
import com.entity.vo.DiscussjiudianjianjieVO;
import com.entity.view.DiscussjiudianjianjieView;

@Service("discussjiudianjianjieService")
public class DiscussjiudianjianjieServiceImpl extends ServiceImpl<DiscussjiudianjianjieDao, DiscussjiudianjianjieEntity> implements DiscussjiudianjianjieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiudianjianjieEntity> page = this.selectPage(
                new Query<DiscussjiudianjianjieEntity>(params).getPage(),
                new EntityWrapper<DiscussjiudianjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiudianjianjieEntity> wrapper) {
		  Page<DiscussjiudianjianjieView> page =new Query<DiscussjiudianjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiudianjianjieVO> selectListVO(Wrapper<DiscussjiudianjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiudianjianjieVO selectVO(Wrapper<DiscussjiudianjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiudianjianjieView> selectListView(Wrapper<DiscussjiudianjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiudianjianjieView selectView(Wrapper<DiscussjiudianjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
