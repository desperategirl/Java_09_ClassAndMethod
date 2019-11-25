package com.biz.method.exec;

import com.biz.method.domain.ScoreDTO;
import com.biz.method.service.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreDTO sDTO = new ScoreDTO();
		ScoreServiceV1 sS = new ScoreServiceV1();

		sDTO.sNum = "1";
		sDTO.sKor = 80;
		sDTO.sEng = 77;
		sDTO.sMath = 67;

		sS.viewScore(sDTO);

	}

}
