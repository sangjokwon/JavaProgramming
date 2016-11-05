package tutorial;

import java.util.Scanner;

public class Programming18 {
	public static void main(String[] args) {
		int su, th, hun, ten, one;

		Scanner sc = new Scanner(System.in);

		System.out.print("10000보다 작은 정수를 입력하세요 : ");
		su = sc.nextInt();

		th = su / 1000;
		hun = su % 1000 / 100;
		ten = su % 100 / 10;
		one = su % 10;

		System.out.println("천의 자리 : " + th);
		System.out.println("백의 자리 : " + hun);
		System.out.println("십의 자리 : " + ten);
		System.out.println("일의 자리 : " + one);

		sc.close();

	}
}