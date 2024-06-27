package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//		숫자를 입력받아 아래와 같이 출력하세요

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자:");
		int a = sc.nextInt();
		int i,p;
		
		for(i=1;i<a+1;i++) {
			for(p=0;p<i;p++) {
				System.out.print(i);
			}
			System.out.println("");
		}

		sc.close();
	}

}
