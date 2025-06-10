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


import com.dao.PingshentiaojianDao;
import com.entity.PingshentiaojianEntity;
import com.service.PingshentiaojianService;
import com.entity.vo.PingshentiaojianVO;
import com.entity.view.PingshentiaojianView;

@Service("pingshentiaojianService")
public class PingshentiaojianServiceImpl extends ServiceImpl<PingshentiaojianDao, PingshentiaojianEntity> implements PingshentiaojianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingshentiaojianEntity> page = this.selectPage(
                new Query<PingshentiaojianEntity>(params).getPage(),
                new EntityWrapper<PingshentiaojianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingshentiaojianEntity> wrapper) {
		  Page<PingshentiaojianView> page =new Query<PingshentiaojianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingshentiaojianVO> selectListVO(Wrapper<PingshentiaojianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingshentiaojianVO selectVO(Wrapper<PingshentiaojianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingshentiaojianView> selectListView(Wrapper<PingshentiaojianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingshentiaojianView selectView(Wrapper<PingshentiaojianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
