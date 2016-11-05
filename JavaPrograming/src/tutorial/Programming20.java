package tutorial;

import java.util.Scanner;

public class Programming20 {

	public static void main(String[] args) {
		int r, h;
		double volume;
		final double PI = 3.14;

		Scanner sc = new Scanner(System.in);

		System.out.print("원기둥 밑면의 반지름을 입력하시오 : ");
		r = sc.nextInt();
		System.out.print("원기둥의 높이를 입력하시오 : ");
		h = sc.nextInt();

		volume = r * r * PI * h;

		System.out.println("원기둥의 부피는 " + volume + "입니다");

		sc.close();
	}

}
