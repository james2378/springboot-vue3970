package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhichengshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhichengshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhichengshenqingView;


/**
 * 职称申请
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface ZhichengshenqingService extends IService<ZhichengshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhichengshenqingVO> selectListVO(Wrapper<ZhichengshenqingEntity> wrapper);
   	
   	ZhichengshenqingVO selectVO(@Param("ew") Wrapper<ZhichengshenqingEntity> wrapper);
   	
   	List<ZhichengshenqingView> selectListView(Wrapper<ZhichengshenqingEntity> wrapper);
   	
   	ZhichengshenqingView selectView(@Param("ew") Wrapper<ZhichengshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhichengshenqingEntity> wrapper);
   	
}

