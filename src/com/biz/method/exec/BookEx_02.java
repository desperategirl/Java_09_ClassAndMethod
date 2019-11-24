package com.biz.method.exec;

import com.biz.method.domain.BookDTO;
import com.biz.method.service.BookServiceV2;

public class BookEx_02 {

	public static void main(String[] args) {

		BookDTO bDTO = new BookDTO();
		BookServiceV2 bS = new BookServiceV2();
		
		bDTO.bNum = "0001";
		bDTO.bName = "책이름";
		bDTO.bComp = "출판사";
		bDTO.bWriter = "작가";
		bDTO.bPrice = 10000;
		
		bS.viewBook(bDTO.bNum, bDTO.bName, bDTO.bComp, bDTO.bWriter, bDTO.bPrice);
	
		
	}

}
