package tutorial;

import java.util.Scanner;

public class Programming21 {
	public static void main(String[] args) {

		double won, interest, intemoney;

		Scanner sc = new Scanner(System.in);

		System.out.print("예금액을 입력하시오 : ");
		won = sc.nextDouble();
		System.out.print("연이율을 입력하시오(단위 퍼센트): ");
		interest = sc.nextDouble();

		for (int year = 1; year < 3; year++) {
			won = won + (won * interest / 100);
			System.out.println(year + "년 후의 예금액은" + won + "입니다.");
		}
		sc.close();
	}

}