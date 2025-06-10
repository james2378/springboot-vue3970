package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingshentiaojianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingshentiaojianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingshentiaojianView;


/**
 * 评审条件
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface PingshentiaojianService extends IService<PingshentiaojianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingshentiaojianVO> selectListVO(Wrapper<PingshentiaojianEntity> wrapper);
   	
   	PingshentiaojianVO selectVO(@Param("ew") Wrapper<PingshentiaojianEntity> wrapper);
   	
   	List<PingshentiaojianView> selectListView(Wrapper<PingshentiaojianEntity> wrapper);
   	
   	PingshentiaojianView selectView(@Param("ew") Wrapper<PingshentiaojianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingshentiaojianEntity> wrapper);
   	
}

