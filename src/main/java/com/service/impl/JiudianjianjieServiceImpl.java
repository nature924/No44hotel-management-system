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


import com.dao.JiudianjianjieDao;
import com.entity.JiudianjianjieEntity;
import com.service.JiudianjianjieService;
import com.entity.vo.JiudianjianjieVO;
import com.entity.view.JiudianjianjieView;

@Service("jiudianjianjieService")
public class JiudianjianjieServiceImpl extends ServiceImpl<JiudianjianjieDao, JiudianjianjieEntity> implements JiudianjianjieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianjianjieEntity> page = this.selectPage(
                new Query<JiudianjianjieEntity>(params).getPage(),
                new EntityWrapper<JiudianjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianjianjieEntity> wrapper) {
		  Page<JiudianjianjieView> page =new Query<JiudianjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudianjianjieVO> selectListVO(Wrapper<JiudianjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudianjianjieVO selectVO(Wrapper<JiudianjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudianjianjieView> selectListView(Wrapper<JiudianjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianjianjieView selectView(Wrapper<JiudianjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
