package com.biz.method.domain;

public class BookDTO {
	
	public String bNum;
	public String bName;
	public String bComp;
	public String bWriter;
	public int bPrice;
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDTO(String bNum, String bName, String bComp, String bWriter, int bPrice) {
		super();
		this.bNum = bNum;
		this.bName = bName;
		this.bComp = bComp;
		this.bWriter = bWriter;
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "BookDTO [bNum=" + bNum + ", bName=" + bName + ", bComp=" + bComp + ", bWriter=" + bWriter + ", bPrice="
				+ bPrice + "]";
	}
	public String getbNum() {
		return bNum;
	}
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}


}
