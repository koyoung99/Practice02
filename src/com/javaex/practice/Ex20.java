package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("알파벳 1글자(소문자)를 입력하세요	");

		System.out.print("알파벳 : ");
		String eng = sc.nextLine();

		if (eng.equals("a")) {
			System.out.println("모음입니다.");
		} else if (eng.equals("e")) {
			System.out.println("모음입니다.");
		} else if (eng.equals("o")) {
			System.out.println("모음입니다.");
		} else if (eng.equals("i")) {
			System.out.println("모음입니다.");
		} else if (eng.equals("u")) {
			System.out.println("모음입니다.");
		} else {
			System.out.println("자음입니다.");
		}

	}

}
