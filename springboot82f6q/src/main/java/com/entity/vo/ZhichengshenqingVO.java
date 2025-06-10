package com.entity.vo;

import com.entity.ZhichengshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 职称申请
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public class ZhichengshenqingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 评审专业
	 */
	
	private String pingshenzhuanye;
		
	/**
	 * 职称级别
	 */
	
	private String zhichengjibie;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 工作年限
	 */
	
	private String gongzuonianxian;
		
	/**
	 * 从事行业
	 */
	
	private String congshixingye;
		
	/**
	 * 工作单位
	 */
	
	private String gongzuodanwei;
		
	/**
	 * 评审材料
	 */
	
	private String pingshencailiao;
		
	/**
	 * 申请日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：工作年限
	 */
	 
	public void setGongzuonianxian(String gongzuonianxian) {
		this.gongzuonianxian = gongzuonianxian;
	}
	
	/**
	 * 获取：工作年限
	 */
	public String getGongzuonianxian() {
		return gongzuonianxian;
	}
				
	
	/**
	 * 设置：从事行业
	 */
	 
	public void setCongshixingye(String congshixingye) {
		this.congshixingye = congshixingye;
	}
	
	/**
	 * 获取：从事行业
	 */
	public String getCongshixingye() {
		return congshixingye;
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
	 * 设置：评审材料
	 */
	 
	public void setPingshencailiao(String pingshencailiao) {
		this.pingshencailiao = pingshencailiao;
	}
	
	/**
	 * 获取：评审材料
	 */
	public String getPingshencailiao() {
		return pingshencailiao;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
