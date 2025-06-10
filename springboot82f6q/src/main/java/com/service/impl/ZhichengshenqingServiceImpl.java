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


import com.dao.ZhichengshenqingDao;
import com.entity.ZhichengshenqingEntity;
import com.service.ZhichengshenqingService;
import com.entity.vo.ZhichengshenqingVO;
import com.entity.view.ZhichengshenqingView;

@Service("zhichengshenqingService")
public class ZhichengshenqingServiceImpl extends ServiceImpl<ZhichengshenqingDao, ZhichengshenqingEntity> implements ZhichengshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhichengshenqingEntity> page = this.selectPage(
                new Query<ZhichengshenqingEntity>(params).getPage(),
                new EntityWrapper<ZhichengshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhichengshenqingEntity> wrapper) {
		  Page<ZhichengshenqingView> page =new Query<ZhichengshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhichengshenqingVO> selectListVO(Wrapper<ZhichengshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhichengshenqingVO selectVO(Wrapper<ZhichengshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhichengshenqingView> selectListView(Wrapper<ZhichengshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhichengshenqingView selectView(Wrapper<ZhichengshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
