package tutorial;

import java.util.Scanner;

public class Programming7 {
	public static void main(String[] args) {

		int y;

		System.out.print("x의값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		y = 3 * x * x + 7 * x + 11;

		System.out.println("3x^2 + 7*x + 11 계산결과는  " + y);
		sc.close();
	}

}
