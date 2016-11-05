package tutorial;

import java.util.Scanner;

public class Programming13 {
	public static void main(String[] args) {
		final double pyeong = 3.3;
		int x;
		double m;
		Scanner sc = new Scanner(System.in);
		System.out.print("평수를 입력하세요 : ");

		x = sc.nextInt();
		m = pyeong * x;

		System.out.print("파운드를 그램으로 환산하면 : " + m + " M^2 입니다");
		sc.close();
	}
}