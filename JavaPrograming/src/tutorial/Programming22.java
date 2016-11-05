package tutorial;

import java.util.Scanner;

public class Programming22 {
	public static void main(String[] args) {

		double AC, AE, BC, X, Y;

		Scanner sc = new Scanner(System.in);
		// 삼각형 ABC 와 삼각형 ADE, AC:AE=BC:DE
		System.out.print("변 AC의 값을 입력하세요 : ");
		AC = sc.nextDouble();
		System.out.print("변 AE의 값을 입력하세요 : ");
		AE = sc.nextDouble();
		System.out.print("변 BC의 값을 입력하세요 : ");
		BC = sc.nextDouble();

		X = AE * BC;
		Y = X / AC;

		System.out.print("변DE의 길이는 : " + Y);

		sc.close();
	}

}
