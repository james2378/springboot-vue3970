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


import com.dao.JieguogongbuDao;
import com.entity.JieguogongbuEntity;
import com.service.JieguogongbuService;
import com.entity.vo.JieguogongbuVO;
import com.entity.view.JieguogongbuView;

@Service("jieguogongbuService")
public class JieguogongbuServiceImpl extends ServiceImpl<JieguogongbuDao, JieguogongbuEntity> implements JieguogongbuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieguogongbuEntity> page = this.selectPage(
                new Query<JieguogongbuEntity>(params).getPage(),
                new EntityWrapper<JieguogongbuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieguogongbuEntity> wrapper) {
		  Page<JieguogongbuView> page =new Query<JieguogongbuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JieguogongbuVO> selectListVO(Wrapper<JieguogongbuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieguogongbuVO selectVO(Wrapper<JieguogongbuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieguogongbuView> selectListView(Wrapper<JieguogongbuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieguogongbuView selectView(Wrapper<JieguogongbuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
