package tutorial;

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {

		double volume;

		System.out.print("반지름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		volume = r * r * r * 4 / 3;

		System.out.println("구의 부피는 " + r * r * r * 4 / 3 + " 입니다");
		System.out.println(volume);
		sc.close();
	}

}
