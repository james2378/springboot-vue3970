package com.dao;

import com.entity.DiscusspingshentiaojianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusspingshentiaojianVO;
import com.entity.view.DiscusspingshentiaojianView;


/**
 * 评审条件评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface DiscusspingshentiaojianDao extends BaseMapper<DiscusspingshentiaojianEntity> {
	
	List<DiscusspingshentiaojianVO> selectListVO(@Param("ew") Wrapper<DiscusspingshentiaojianEntity> wrapper);
	
	DiscusspingshentiaojianVO selectVO(@Param("ew") Wrapper<DiscusspingshentiaojianEntity> wrapper);
	
	List<DiscusspingshentiaojianView> selectListView(@Param("ew") Wrapper<DiscusspingshentiaojianEntity> wrapper);

	List<DiscusspingshentiaojianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusspingshentiaojianEntity> wrapper);
	
	DiscusspingshentiaojianView selectView(@Param("ew") Wrapper<DiscusspingshentiaojianEntity> wrapper);
	
}
