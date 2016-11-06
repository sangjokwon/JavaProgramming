package tutorial.chapter01;

import java.util.Scanner;

public class Programming27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String eng;

		System.out.println("영문자 하나를 입력하세요");
		eng = sc.nextLine();

		switch (eng) {
		case "A":
		case "a":
		case "E":
		case "e":
		case "I":
		case "i":
		case "O":
		case "o":
		case "U":
		case "u":
			System.out.println(eng + "는 모음입니다");
			break;
		default:
			System.out.println(eng + "는 자음입니다");
			break;

		}sc.close();

	}

}
