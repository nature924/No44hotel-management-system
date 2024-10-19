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


import com.dao.JiudiankefangDao;
import com.entity.JiudiankefangEntity;
import com.service.JiudiankefangService;
import com.entity.vo.JiudiankefangVO;
import com.entity.view.JiudiankefangView;

@Service("jiudiankefangService")
public class JiudiankefangServiceImpl extends ServiceImpl<JiudiankefangDao, JiudiankefangEntity> implements JiudiankefangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudiankefangEntity> page = this.selectPage(
                new Query<JiudiankefangEntity>(params).getPage(),
                new EntityWrapper<JiudiankefangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudiankefangEntity> wrapper) {
		  Page<JiudiankefangView> page =new Query<JiudiankefangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudiankefangVO> selectListVO(Wrapper<JiudiankefangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudiankefangVO selectVO(Wrapper<JiudiankefangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudiankefangView> selectListView(Wrapper<JiudiankefangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudiankefangView selectView(Wrapper<JiudiankefangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
