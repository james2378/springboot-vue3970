package com.dao;

import com.entity.ZhichengshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhichengshenqingVO;
import com.entity.view.ZhichengshenqingView;


/**
 * 职称申请
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface ZhichengshenqingDao extends BaseMapper<ZhichengshenqingEntity> {
	
	List<ZhichengshenqingVO> selectListVO(@Param("ew") Wrapper<ZhichengshenqingEntity> wrapper);
	
	ZhichengshenqingVO selectVO(@Param("ew") Wrapper<ZhichengshenqingEntity> wrapper);
	
	List<ZhichengshenqingView> selectListView(@Param("ew") Wrapper<ZhichengshenqingEntity> wrapper);

	List<ZhichengshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhichengshenqingEntity> wrapper);
	
	ZhichengshenqingView selectView(@Param("ew") Wrapper<ZhichengshenqingEntity> wrapper);
	
}
