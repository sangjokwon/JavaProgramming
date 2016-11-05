package tutorial;

import java.util.Scanner;

public class Programming12 {
	public static void main(String[] args) {
		final double pound = 452;
		int x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.print("파운드를 입력하세요 : ");

		x = sc.nextInt();
		y = pound * x;

		System.out.print("파운드를 그램으로 환산하면 : " + y + "g 입니다");
		sc.close();
	}

}
