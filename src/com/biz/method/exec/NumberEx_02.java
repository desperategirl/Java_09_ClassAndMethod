package com.biz.method.exec;

import com.biz.method.service.NumberServiceV2;

public class NumberEx_02 {
	
	public static void main(String[] args) {
		
		NumberServiceV2 nS = new NumberServiceV2();
		
		System.out.println(nS.add(3, 4));
		
	}

}
