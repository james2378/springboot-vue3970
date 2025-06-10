package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieguogongbuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieguogongbuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieguogongbuView;


/**
 * 结果公布
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public interface JieguogongbuService extends IService<JieguogongbuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieguogongbuVO> selectListVO(Wrapper<JieguogongbuEntity> wrapper);
   	
   	JieguogongbuVO selectVO(@Param("ew") Wrapper<JieguogongbuEntity> wrapper);
   	
   	List<JieguogongbuView> selectListView(Wrapper<JieguogongbuEntity> wrapper);
   	
   	JieguogongbuView selectView(@Param("ew") Wrapper<JieguogongbuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieguogongbuEntity> wrapper);
   	
}

