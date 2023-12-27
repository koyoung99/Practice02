package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("태어난 년도를 입력해주세요");

		System.out.print("년도 : ");
		int year = sc.nextInt();

		System.out.println("올해 : 2023");
		System.out.println("태어난해 : " + year);

		int age = 2023 - year;

		System.out.println("나이 : " + age);
		System.out.println("====================");

		if (age >= 20 && age % 2 == 0) {
			if (age >= 40) {
				System.out.println("20살이상 \n건강검진해\n암 검사");
			} else {
				System.out.println("20살이상 \n건강검진해\n암 검사X");
			}
		} else {
			System.out.println("20살이상 \n건강검진해 아님");
		}

	}

}
