package com.biz.method.service;

import com.biz.method.domain.ScoreDTO;

public class ScoreServiceV1 {

	public void viewScore() {

		ScoreDTO sDTO = new ScoreDTO();

		System.out.println("과목성적");
		System.out.println("국어 : " + sDTO.sKor);
		System.out.println("영어 : " + sDTO.sEng);
		System.out.println("수학 : " + sDTO.sMath);

		int sum = 0;
		sum = sDTO.sKor + sDTO.sEng + sDTO.sMath;
		System.out.println("총점 : " + sum);

		System.out.println("평균 : " + sum / 3);

	}
}
