package com.entity.view;

import com.entity.PingshenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 评审员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
@TableName("pingshenyuan")
public class PingshenyuanView  extends PingshenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PingshenyuanView(){
	}
 
 	public PingshenyuanView(PingshenyuanEntity pingshenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, pingshenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
