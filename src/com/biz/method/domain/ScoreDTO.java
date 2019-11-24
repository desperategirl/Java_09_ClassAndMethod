package com.biz.method.domain;

public class ScoreDTO {
	
	public String sNum;
	public int sKor;
	public int sEng;
	public int sMath;
	public ScoreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreDTO(String sNum, int sKor, int sEng, int sMath) {
		super();
		this.sNum = sNum;
		this.sKor = sKor;
		this.sEng = sEng;
		this.sMath = sMath;
	}
	@Override
	public String toString() {
		return "ScoreDTO [sNum=" + sNum + ", sKor=" + sKor + ", sEng=" + sEng + ", sMath=" + sMath + "]";
	}
	public String getsNum() {
		return sNum;
	}
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	public int getsKor() {
		return sKor;
	}
	public void setsKor(int sKor) {
		this.sKor = sKor;
	}
	public int getsEng() {
		return sEng;
	}
	public void setsEng(int sEng) {
		this.sEng = sEng;
	}
	public int getsMath() {
		return sMath;
	}
	public void setsMath(int sMath) {
		this.sMath = sMath;
	}

	
}
