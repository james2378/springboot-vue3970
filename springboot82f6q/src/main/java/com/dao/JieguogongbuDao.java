package com.dao;

import com.entity.JieguogongbuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieguogongbuVO;
import com.entity.view.JieguogongbuView;


/**
 * 结果公布
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface JieguogongbuDao extends BaseMapper<JieguogongbuEntity> {
	
	List<JieguogongbuVO> selectListVO(@Param("ew") Wrapper<JieguogongbuEntity> wrapper);
	
	JieguogongbuVO selectVO(@Param("ew") Wrapper<JieguogongbuEntity> wrapper);
	
	List<JieguogongbuView> selectListView(@Param("ew") Wrapper<JieguogongbuEntity> wrapper);

	List<JieguogongbuView> selectListView(Pagination page,@Param("ew") Wrapper<JieguogongbuEntity> wrapper);
	
	JieguogongbuView selectView(@Param("ew") Wrapper<JieguogongbuEntity> wrapper);
	
}
