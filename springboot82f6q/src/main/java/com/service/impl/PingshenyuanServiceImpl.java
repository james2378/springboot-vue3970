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


import com.dao.PingshenyuanDao;
import com.entity.PingshenyuanEntity;
import com.service.PingshenyuanService;
import com.entity.vo.PingshenyuanVO;
import com.entity.view.PingshenyuanView;

@Service("pingshenyuanService")
public class PingshenyuanServiceImpl extends ServiceImpl<PingshenyuanDao, PingshenyuanEntity> implements PingshenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingshenyuanEntity> page = this.selectPage(
                new Query<PingshenyuanEntity>(params).getPage(),
                new EntityWrapper<PingshenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingshenyuanEntity> wrapper) {
		  Page<PingshenyuanView> page =new Query<PingshenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingshenyuanVO> selectListVO(Wrapper<PingshenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingshenyuanVO selectVO(Wrapper<PingshenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingshenyuanView> selectListView(Wrapper<PingshenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingshenyuanView selectView(Wrapper<PingshenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
