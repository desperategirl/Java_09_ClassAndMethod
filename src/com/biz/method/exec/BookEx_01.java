package com.biz.method.exec;

import com.biz.method.domain.BookDTO;

public class BookEx_01 {

	public static void main(String[] args) {

		BookDTO bDTO = new BookDTO();

		bDTO.bNum = "0001";
		bDTO.bName = "책이름";
		bDTO.bComp = "출판사";
		bDTO.bWriter = "작가";
		bDTO.bPrice = 10000;
		
		System.out.println
		(bDTO.bNum+bDTO.bName+bDTO.bComp+bDTO.bWriter+bDTO.bPrice);
	}

}
