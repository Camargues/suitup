package com.suitup.domain;

import org.springframework.web.multipart.MultipartFile;


public class SuitUpProductVO {
	
	private int proNum;
	private String proName;
	private int proPrice;
	private int cateNum;
	private int cateDtnum;
	private String proPname;
	private int dtproCount;
	private int dtproSize;
	
	
	public int getProNum() {
		return proNum;
	}
	public void setProNum(int proNum) {
		this.proNum = proNum;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getCateNum() {
		return cateNum;
	}
	public void setCateNum(int cateNum) {
		this.cateNum = cateNum;
	}
	public int getCateDtnum() {
		return cateDtnum;
	}
	public void setCateDtnum(int cateDtnum) {
		this.cateDtnum = cateDtnum;
	}
	public String getProPname() {
		return proPname;
	}
	public void setProPname(String proPname) {
		this.proPname = proPname;
	}
	public int getDtproCount() {
		return dtproCount;
	}
	public void setDtproCount(int dtproCount) {
		this.dtproCount = dtproCount;
	}
	public int getDtproSize() {
		return dtproSize;
	}
	public void setDtproSize(int dtproSize) {
		this.dtproSize = dtproSize;
	}
	
	
	
	
	
}
