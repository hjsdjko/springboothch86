package com.entity.model;

import com.entity.XueshengdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生档案
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-09 15:12:42
 */
public class XueshengdanganModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 学生照片
	 */
	
	private String xueshengzhaopian;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 民族
	 */
	
	private String minzu;
		
	/**
	 * 出生年月
	 */
	
	private String chushengnianyue;
		
	/**
	 * 在读学校
	 */
	
	private String zaiduxuexiao;
		
	/**
	 * 入学时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruxueshijian;
		
	/**
	 * 学生身高
	 */
	
	private String xueshengshengao;
		
	/**
	 * 学生体重
	 */
	
	private String xueshengtizhong;
		
	/**
	 * 父亲姓名
	 */
	
	private String fuqinxingming;
		
	/**
	 * 父亲电话
	 */
	
	private String fuqindianhua;
		
	/**
	 * 母亲姓名
	 */
	
	private String muqinxingming;
		
	/**
	 * 母亲电话
	 */
	
	private String muqindianhua;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 奖惩记录
	 */
	
	private String jiangchengjilu;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：学生照片
	 */
	 
	public void setXueshengzhaopian(String xueshengzhaopian) {
		this.xueshengzhaopian = xueshengzhaopian;
	}
	
	/**
	 * 获取：学生照片
	 */
	public String getXueshengzhaopian() {
		return xueshengzhaopian;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：民族
	 */
	 
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
				
	
	/**
	 * 设置：出生年月
	 */
	 
	public void setChushengnianyue(String chushengnianyue) {
		this.chushengnianyue = chushengnianyue;
	}
	
	/**
	 * 获取：出生年月
	 */
	public String getChushengnianyue() {
		return chushengnianyue;
	}
				
	
	/**
	 * 设置：在读学校
	 */
	 
	public void setZaiduxuexiao(String zaiduxuexiao) {
		this.zaiduxuexiao = zaiduxuexiao;
	}
	
	/**
	 * 获取：在读学校
	 */
	public String getZaiduxuexiao() {
		return zaiduxuexiao;
	}
				
	
	/**
	 * 设置：入学时间
	 */
	 
	public void setRuxueshijian(Date ruxueshijian) {
		this.ruxueshijian = ruxueshijian;
	}
	
	/**
	 * 获取：入学时间
	 */
	public Date getRuxueshijian() {
		return ruxueshijian;
	}
				
	
	/**
	 * 设置：学生身高
	 */
	 
	public void setXueshengshengao(String xueshengshengao) {
		this.xueshengshengao = xueshengshengao;
	}
	
	/**
	 * 获取：学生身高
	 */
	public String getXueshengshengao() {
		return xueshengshengao;
	}
				
	
	/**
	 * 设置：学生体重
	 */
	 
	public void setXueshengtizhong(String xueshengtizhong) {
		this.xueshengtizhong = xueshengtizhong;
	}
	
	/**
	 * 获取：学生体重
	 */
	public String getXueshengtizhong() {
		return xueshengtizhong;
	}
				
	
	/**
	 * 设置：父亲姓名
	 */
	 
	public void setFuqinxingming(String fuqinxingming) {
		this.fuqinxingming = fuqinxingming;
	}
	
	/**
	 * 获取：父亲姓名
	 */
	public String getFuqinxingming() {
		return fuqinxingming;
	}
				
	
	/**
	 * 设置：父亲电话
	 */
	 
	public void setFuqindianhua(String fuqindianhua) {
		this.fuqindianhua = fuqindianhua;
	}
	
	/**
	 * 获取：父亲电话
	 */
	public String getFuqindianhua() {
		return fuqindianhua;
	}
				
	
	/**
	 * 设置：母亲姓名
	 */
	 
	public void setMuqinxingming(String muqinxingming) {
		this.muqinxingming = muqinxingming;
	}
	
	/**
	 * 获取：母亲姓名
	 */
	public String getMuqinxingming() {
		return muqinxingming;
	}
				
	
	/**
	 * 设置：母亲电话
	 */
	 
	public void setMuqindianhua(String muqindianhua) {
		this.muqindianhua = muqindianhua;
	}
	
	/**
	 * 获取：母亲电话
	 */
	public String getMuqindianhua() {
		return muqindianhua;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：奖惩记录
	 */
	 
	public void setJiangchengjilu(String jiangchengjilu) {
		this.jiangchengjilu = jiangchengjilu;
	}
	
	/**
	 * 获取：奖惩记录
	 */
	public String getJiangchengjilu() {
		return jiangchengjilu;
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
			
}
