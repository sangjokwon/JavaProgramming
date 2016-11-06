package tutorial.chapter01;

import java.util.Scanner;

public class Programming28 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1~10까지의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 11) {
			if (num == 2)
				System.out.println("1등 당첨");
			else if (num == 5)
				System.out.println("2등 당첨");
			else if (num == 7)
				System.out.println("3등 당첨");
			else
				System.out.println("꽝입니다.");
		}
		if (num > 10)
			System.out.println("1~10까지 숫자를 입력하세요");

		sc.close();

	}

}
