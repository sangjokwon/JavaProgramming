package tutorial;

import java.util.Scanner;

public class Programming04 {
	public static void main(String[] args) {

		double C;

		System.out.print("화씨를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		double F = sc.nextDouble();

		C = (F - 32) * 5 / 9;

		System.out.println("섭씨는 " + (F - 32) * 5 / 9 + " 입니다");
		System.out.println(C);
		sc.close();
	}

}