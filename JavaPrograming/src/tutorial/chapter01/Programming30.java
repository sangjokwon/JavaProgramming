package tutorial.chapter01;

import java.util.Scanner;

public class Programming30 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 수를 정하세요(ex : 3) 가장작은수 출력: ");

		int count = sc.nextInt();
		int[] arrayx = new int[count];
		for (int i = 0; i < count; i++) {
			int x = sc.nextInt();
			arrayx[i] = x;
		}

		if (arrayx[0] > arrayx[1]) {
			if (arrayx[1] > arrayx[2])
				System.out.println(arrayx[2]);
			else if (arrayx[0] < arrayx[2])
				System.out.println(arrayx[1]);
		} else {
			if (arrayx[0] < arrayx[2])
				System.out.println(arrayx[0]);
			else if (arrayx[1] > arrayx[2])
				System.out.println(arrayx[2]);
		}
		sc.close();

	}

}
