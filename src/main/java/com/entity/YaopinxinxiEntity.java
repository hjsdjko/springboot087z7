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
 * 药品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-10 10:19:26
 */
@TableName("yaopinxinxi")
public class YaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaopinxinxiEntity() {
		
	}
	
	public YaopinxinxiEntity(T t) {
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
	 * 药品编号
	 */
					
	private String yaopinbianhao;
	
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 药品类型
	 */
					
	private String yaopinleixing;
	
	/**
	 * 剂型
	 */
					
	private String jixing;
	
	/**
	 * 生产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 生产单位
	 */
					
	private String shengchandanwei;
	
	/**
	 * 生产地址
	 */
					
	private String shengchandizhi;
	
	/**
	 * 药品图片
	 */
					
	private String yaopintupian;
	
	/**
	 * 保质期
	 */
					
	private String baozhiqi;
	
	/**
	 * 药品价格
	 */
					
	private Float yaopinjiage;
	
	/**
	 * 药品说明
	 */
					
	private String yaopinshuoming;
	
	
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
	 * 设置：药品编号
	 */
	public void setYaopinbianhao(String yaopinbianhao) {
		this.yaopinbianhao = yaopinbianhao;
	}
	/**
	 * 获取：药品编号
	 */
	public String getYaopinbianhao() {
		return yaopinbianhao;
	}
	/**
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
	/**
	 * 设置：药品类型
	 */
	public void setYaopinleixing(String yaopinleixing) {
		this.yaopinleixing = yaopinleixing;
	}
	/**
	 * 获取：药品类型
	 */
	public String getYaopinleixing() {
		return yaopinleixing;
	}
	/**
	 * 设置：剂型
	 */
	public void setJixing(String jixing) {
		this.jixing = jixing;
	}
	/**
	 * 获取：剂型
	 */
	public String getJixing() {
		return jixing;
	}
	/**
	 * 设置：生产日期
	 */
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
	/**
	 * 设置：生产单位
	 */
	public void setShengchandanwei(String shengchandanwei) {
		this.shengchandanwei = shengchandanwei;
	}
	/**
	 * 获取：生产单位
	 */
	public String getShengchandanwei() {
		return shengchandanwei;
	}
	/**
	 * 设置：生产地址
	 */
	public void setShengchandizhi(String shengchandizhi) {
		this.shengchandizhi = shengchandizhi;
	}
	/**
	 * 获取：生产地址
	 */
	public String getShengchandizhi() {
		return shengchandizhi;
	}
	/**
	 * 设置：药品图片
	 */
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
	/**
	 * 设置：保质期
	 */
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
	/**
	 * 设置：药品价格
	 */
	public void setYaopinjiage(Float yaopinjiage) {
		this.yaopinjiage = yaopinjiage;
	}
	/**
	 * 获取：药品价格
	 */
	public Float getYaopinjiage() {
		return yaopinjiage;
	}
	/**
	 * 设置：药品说明
	 */
	public void setYaopinshuoming(String yaopinshuoming) {
		this.yaopinshuoming = yaopinshuoming;
	}
	/**
	 * 获取：药品说明
	 */
	public String getYaopinshuoming() {
		return yaopinshuoming;
	}

}
