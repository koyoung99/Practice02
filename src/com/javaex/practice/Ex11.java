package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result;

		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			result = num1 / num2;
			System.out.println("몫 : " + result);
			result = num1 % num2;
			System.out.println("나머지 : " + result);
		} else {
			result = num2 / num1;
			System.out.println("몫 : " + result);
			result = num2 % num1;
			System.out.println("나머지 : " + result);
		}
		sc.close();

	}

}
