package com.entity.model;

import com.entity.PingshentiaojianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 评审条件
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
public class PingshentiaojianModel  implements Serializable {
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
	 * 封面图
	 */
	
	private String fengmiantu;
		
	/**
	 * 评审时间
	 */
	
	private String pingshenshijian;
		
	/**
	 * 评审条件
	 */
	
	private String pingshentiaojian;
		
	/**
	 * 资料清单
	 */
	
	private String ziliaoqingdan;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：封面图
	 */
	 
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
	}
				
	
	/**
	 * 设置：评审时间
	 */
	 
	public void setPingshenshijian(String pingshenshijian) {
		this.pingshenshijian = pingshenshijian;
	}
	
	/**
	 * 获取：评审时间
	 */
	public String getPingshenshijian() {
		return pingshenshijian;
	}
				
	
	/**
	 * 设置：评审条件
	 */
	 
	public void setPingshentiaojian(String pingshentiaojian) {
		this.pingshentiaojian = pingshentiaojian;
	}
	
	/**
	 * 获取：评审条件
	 */
	public String getPingshentiaojian() {
		return pingshentiaojian;
	}
				
	
	/**
	 * 设置：资料清单
	 */
	 
	public void setZiliaoqingdan(String ziliaoqingdan) {
		this.ziliaoqingdan = ziliaoqingdan;
	}
	
	/**
	 * 获取：资料清单
	 */
	public String getZiliaoqingdan() {
		return ziliaoqingdan;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
