package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingshenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingshenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingshenyuanView;


/**
 * 评审员
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface PingshenyuanService extends IService<PingshenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingshenyuanVO> selectListVO(Wrapper<PingshenyuanEntity> wrapper);
   	
   	PingshenyuanVO selectVO(@Param("ew") Wrapper<PingshenyuanEntity> wrapper);
   	
   	List<PingshenyuanView> selectListView(Wrapper<PingshenyuanEntity> wrapper);
   	
   	PingshenyuanView selectView(@Param("ew") Wrapper<PingshenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingshenyuanEntity> wrapper);
   	
}

