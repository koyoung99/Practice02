package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("키와 몸무게를 입력해주세요.");

		System.out.print("키 : ");
		double tall = sc.nextDouble();

		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();

		double average = (tall - 100) * 0.9;

		if (weight > average) {
			System.out.println("과체중 입니다.");
		} else if (weight < average) {
			System.out.println("저체중 입니다.");
		} else {
			System.out.println("표준 입니다.");
		}
		System.out.println("표준체중 : " + average);
	}

}
