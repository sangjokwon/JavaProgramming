package tutorial;

import java.util.Scanner;

public class Programming23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x 좌표를 입력하세요 : ");
		int x = sc.nextInt();

		System.out.print("y 좌표를 입력하세요 : ");
		int y = sc.nextInt();

		int sabun = (x > 0) ? (y > 0 ? 1 : 2) : (y > 0 ? 4 : 3);

		System.out.println(sabun + "사분면");

		sc.close();

	}

}