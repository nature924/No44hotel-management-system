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


import com.dao.DiscussjiudiankefangDao;
import com.entity.DiscussjiudiankefangEntity;
import com.service.DiscussjiudiankefangService;
import com.entity.vo.DiscussjiudiankefangVO;
import com.entity.view.DiscussjiudiankefangView;

@Service("discussjiudiankefangService")
public class DiscussjiudiankefangServiceImpl extends ServiceImpl<DiscussjiudiankefangDao, DiscussjiudiankefangEntity> implements DiscussjiudiankefangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiudiankefangEntity> page = this.selectPage(
                new Query<DiscussjiudiankefangEntity>(params).getPage(),
                new EntityWrapper<DiscussjiudiankefangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiudiankefangEntity> wrapper) {
		  Page<DiscussjiudiankefangView> page =new Query<DiscussjiudiankefangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiudiankefangVO> selectListVO(Wrapper<DiscussjiudiankefangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiudiankefangVO selectVO(Wrapper<DiscussjiudiankefangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiudiankefangView> selectListView(Wrapper<DiscussjiudiankefangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiudiankefangView selectView(Wrapper<DiscussjiudiankefangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
