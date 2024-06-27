package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
//		다음과 같이 출력하세요
		
		int i = 1;
		int p;

		for (i = 0; i <= 9; i++) {
			for (p = 1; p <= 10; p++) {
				System.out.print(p+i);
				System.out.print("	");
			}
			System.out.println("");
		}
	}

}
