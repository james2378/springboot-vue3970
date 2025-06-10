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


import com.dao.DiscusspingshentiaojianDao;
import com.entity.DiscusspingshentiaojianEntity;
import com.service.DiscusspingshentiaojianService;
import com.entity.vo.DiscusspingshentiaojianVO;
import com.entity.view.DiscusspingshentiaojianView;

@Service("discusspingshentiaojianService")
public class DiscusspingshentiaojianServiceImpl extends ServiceImpl<DiscusspingshentiaojianDao, DiscusspingshentiaojianEntity> implements DiscusspingshentiaojianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusspingshentiaojianEntity> page = this.selectPage(
                new Query<DiscusspingshentiaojianEntity>(params).getPage(),
                new EntityWrapper<DiscusspingshentiaojianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusspingshentiaojianEntity> wrapper) {
		  Page<DiscusspingshentiaojianView> page =new Query<DiscusspingshentiaojianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusspingshentiaojianVO> selectListVO(Wrapper<DiscusspingshentiaojianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusspingshentiaojianVO selectVO(Wrapper<DiscusspingshentiaojianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusspingshentiaojianView> selectListView(Wrapper<DiscusspingshentiaojianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusspingshentiaojianView selectView(Wrapper<DiscusspingshentiaojianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
