package com.suitup.domain;

import org.springframework.web.multipart.MultipartFile;


public class SuitUpProductVO {
	
	private int proNum;
	private String proName;
	private int proPrice;
	private String proDetail;
	private int cateNum;
	private int cateDtnum;
	private int dtproCount;
	private String pro_fname;
	private long pro_fsize;
	
	//이미지 파일
	   MultipartFile file;	// write.jsp에 파일첨부시 name="file"과 동일한 변수명
		
	    public MultipartFile getFile() {
	        return file;
	    }
//	    public void setFile(MultipartFile file) {
//	        this.file = file;
//			
//	        // 업로드 파일 접근
//	        if(! file.isEmpty()){
//	            this.pro_fname = file.getOriginalFilename();
//	            this.pro_fsize = file.getSize();
//				
//	            //***********************************************
//	            // 해당 경로로 변경 (실제 경로임)
//	            File f = new File(""+pro_fname);
//				
//	            try {
//	                file.transferTo(f);
//	            } catch (IllegalStateException e) {				
//	                e.printStackTrace();
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        }
//	    }
	public int getDtproCount() {
		return dtproCount;
	}
	public void setDtproCount(int dtproCount) {
		this.dtproCount = dtproCount;
	}
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
	public String getProDetail() {
		return proDetail;
	}
	public void setProDetail(String proDetail) {
		this.proDetail = proDetail;
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
	public long getPro_fsize() {
		return pro_fsize;
	}
	public void setPro_fsize(long pro_fsize) {
		this.pro_fsize = pro_fsize;
	}
	public String getPro_fname() {
		return pro_fname;
	}
	public void setPro_fname(String pro_fname) {
		this.pro_fname = pro_fname;
	}
	
}
