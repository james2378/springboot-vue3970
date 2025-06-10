package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 评审条件
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
@TableName("pingshentiaojian")
public class PingshentiaojianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PingshentiaojianEntity() {
		
	}
	
	public PingshentiaojianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 省份
	 */
					
	private String shengfen;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：省份
	 */
	public void setShengfen(String shengfen) {
		this.shengfen = shengfen;
	}
	/**
	 * 获取：省份
	 */
	public String getShengfen() {
		return shengfen;
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
