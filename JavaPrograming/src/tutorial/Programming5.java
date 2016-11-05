package tutorial;

import java.util.Scanner;

public class Programming5 {
	public static void main(String[] args) {

		int xx, xxx;

		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		xx = x*x;
		xxx = x*x*x;

		System.out.println("제곱값  : " + x*x +" 세제곱 : " + x*x*x);
		System.out.println(xx + " " + xxx);
		sc.close();
	}

}

