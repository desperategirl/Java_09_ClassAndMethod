package com.biz.method.exec;

import com.biz.method.domain.BookDTO;

public class BookEx_03 {
	
	public static void main(String[] args) {
		
		BookDTO[] bDTO = new BookDTO[2];
		
		bDTO[0] = new BookDTO("B01","자바","이지출판","박은종",12000);
		bDTO[1] = new BookDTO("B02","정서","도은출판","남궁원,",35000);
		
		System.out.println(bDTO[0]);
		System.out.println(bDTO[1]);
		
	}
		
}
