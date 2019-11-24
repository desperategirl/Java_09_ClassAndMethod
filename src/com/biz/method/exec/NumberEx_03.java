package com.biz.method.exec;

import com.biz.method.service.NumberServiceV3;

public class NumberEx_03 {

	public static void main(String[] args) {

		NumberServiceV3 nS = new NumberServiceV3();

		int num01 = 1;
		int num02 = 5;

		System.out.println
		(num01 + "+" + num02 + "=" + nS.add(num01, num02));

	}

}
