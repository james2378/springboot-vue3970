package com.entity.model;

import com.entity.JieguogongbuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 结果公布
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public class JieguogongbuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 工作单位
	 */
	
	private String gongzuodanwei;
		
	/**
	 * 评审专业
	 */
	
	private String pingshenzhuanye;
		
	/**
	 * 职称级别
	 */
	
	private String zhichengjibie;
		
	/**
	 * 评审结果
	 */
	
	private String pingshenjieguo;
		
	/**
	 * 评审日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingshenriqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 评审员姓名
	 */
	
	private String pingshenyuanxingming;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：工作单位
	 */
	 
	public void setGongzuodanwei(String gongzuodanwei) {
		this.gongzuodanwei = gongzuodanwei;
	}
	
	/**
	 * 获取：工作单位
	 */
	public String getGongzuodanwei() {
		return gongzuodanwei;
	}
				
	
	/**
	 * 设置：评审专业
	 */
	 
	public void setPingshenzhuanye(String pingshenzhuanye) {
		this.pingshenzhuanye = pingshenzhuanye;
	}
	
	/**
	 * 获取：评审专业
	 */
	public String getPingshenzhuanye() {
		return pingshenzhuanye;
	}
				
	
	/**
	 * 设置：职称级别
	 */
	 
	public void setZhichengjibie(String zhichengjibie) {
		this.zhichengjibie = zhichengjibie;
	}
	
	/**
	 * 获取：职称级别
	 */
	public String getZhichengjibie() {
		return zhichengjibie;
	}
				
	
	/**
	 * 设置：评审结果
	 */
	 
	public void setPingshenjieguo(String pingshenjieguo) {
		this.pingshenjieguo = pingshenjieguo;
	}
	
	/**
	 * 获取：评审结果
	 */
	public String getPingshenjieguo() {
		return pingshenjieguo;
	}
				
	
	/**
	 * 设置：评审日期
	 */
	 
	public void setPingshenriqi(Date pingshenriqi) {
		this.pingshenriqi = pingshenriqi;
	}
	
	/**
	 * 获取：评审日期
	 */
	public Date getPingshenriqi() {
		return pingshenriqi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：评审员姓名
	 */
	 
	public void setPingshenyuanxingming(String pingshenyuanxingming) {
		this.pingshenyuanxingming = pingshenyuanxingming;
	}
	
	/**
	 * 获取：评审员姓名
	 */
	public String getPingshenyuanxingming() {
		return pingshenyuanxingming;
	}
			
}
