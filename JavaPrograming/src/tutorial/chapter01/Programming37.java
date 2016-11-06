package tutorial.chapter01;

import java.util.Scanner;

public class Programming37 {
	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int n = 2;
		int sum = 2;

		Scanner sc = new Scanner(System.in);

		System.out.print("몇번째 피보나치수열까지 볼것인지 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			int c = a + b;
			if (i == 2)
				System.out.print("1 1 ");
			System.out.print(c);
			if (i < num)
				System.out.print(" ");
			sum = sum + c;
			n = n + 1;
			a = b;
			b = c;

		}
		System.out.println("합계 : " + sum);
	}

}
