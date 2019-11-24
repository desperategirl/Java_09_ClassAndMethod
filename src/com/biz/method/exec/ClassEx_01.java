package com.biz.method.exec;

import com.biz.method.service.ClassService;

public class ClassEx_01 {
	
	public static void main(String[] args) {
		
		ClassService cS = new ClassService();
		System.out.println(cS.viewNation("한국"));
		
	}

}
