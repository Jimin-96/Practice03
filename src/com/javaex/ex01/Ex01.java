package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
//		아래의 출력결과를 예상하여 작성하세요.(코드를 작성해서 예상과 맞는지 확인해 보세요.
		
		System.out.println("while문");
		int index = 0;
		while (index<3) {
			System.out.println("index="+index);
			index++;
		}
		
		System.out.println("for문");
		for(int oder = 0;oder<3;oder++) {
			System.out.println("oder="+oder);
		}

	}

}