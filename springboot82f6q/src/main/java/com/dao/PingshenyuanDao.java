package com.dao;

import com.entity.PingshenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingshenyuanVO;
import com.entity.view.PingshenyuanView;


/**
 * 评审员
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface PingshenyuanDao extends BaseMapper<PingshenyuanEntity> {
	
	List<PingshenyuanVO> selectListVO(@Param("ew") Wrapper<PingshenyuanEntity> wrapper);
	
	PingshenyuanVO selectVO(@Param("ew") Wrapper<PingshenyuanEntity> wrapper);
	
	List<PingshenyuanView> selectListView(@Param("ew") Wrapper<PingshenyuanEntity> wrapper);

	List<PingshenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<PingshenyuanEntity> wrapper);
	
	PingshenyuanView selectView(@Param("ew") Wrapper<PingshenyuanEntity> wrapper);
	
}
