package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
//		아래와 같이 구구단을 출력하세요
		
		
		for(int i=1;i<10;i++) {
			for(int dan=2;dan<10;dan++) {
				System.out.print(dan+"*"+i+"="+dan*i);
				System.out.print("	");
			}
			System.out.println();
		}

	}

}
