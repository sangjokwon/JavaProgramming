package tutorial.chapter01;

import java.util.Scanner;

public class Programming33 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int x = sc.nextInt();

		if (x > 0) {
			for (int i = 1; i < x; i++) {
				if (i % 3 == 0)
					System.out.print(i + " ");
			}
		} else
			System.out.println("0보다 작습니다");

		sc.close();
	}
}
