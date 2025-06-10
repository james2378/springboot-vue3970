package com.dao;

import com.entity.PingshentiaojianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingshentiaojianVO;
import com.entity.view.PingshentiaojianView;


/**
 * 评审条件
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface PingshentiaojianDao extends BaseMapper<PingshentiaojianEntity> {
	
	List<PingshentiaojianVO> selectListVO(@Param("ew") Wrapper<PingshentiaojianEntity> wrapper);
	
	PingshentiaojianVO selectVO(@Param("ew") Wrapper<PingshentiaojianEntity> wrapper);
	
	List<PingshentiaojianView> selectListView(@Param("ew") Wrapper<PingshentiaojianEntity> wrapper);

	List<PingshentiaojianView> selectListView(Pagination page,@Param("ew") Wrapper<PingshentiaojianEntity> wrapper);
	
	PingshentiaojianView selectView(@Param("ew") Wrapper<PingshentiaojianEntity> wrapper);
	
}
