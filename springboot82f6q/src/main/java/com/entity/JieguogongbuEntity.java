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
 * 结果公布
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-11 11:06:06
 */
@TableName("jieguogongbu")
public class JieguogongbuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JieguogongbuEntity() {
		
	}
	
	public JieguogongbuEntity(T t) {
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
	 * 用户名
	 */
					
	private String yonghuming;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
