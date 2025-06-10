package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusspingshentiaojianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusspingshentiaojianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusspingshentiaojianView;


/**
 * 评审条件评论表
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface DiscusspingshentiaojianService extends IService<DiscusspingshentiaojianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusspingshentiaojianVO> selectListVO(Wrapper<DiscusspingshentiaojianEntity> wrapper);
   	
   	DiscusspingshentiaojianVO selectVO(@Param("ew") Wrapper<DiscusspingshentiaojianEntity> wrapper);
   	
   	List<DiscusspingshentiaojianView> selectListView(Wrapper<DiscusspingshentiaojianEntity> wrapper);
   	
   	DiscusspingshentiaojianView selectView(@Param("ew") Wrapper<DiscusspingshentiaojianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusspingshentiaojianEntity> wrapper);
   	
}

