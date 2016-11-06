package tutorial.chapter01;

import java.util.Scanner;

public class Programming25 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("R, C, T (사각, 삼각, 원)를 입력하세요 : ");
		String area = sc.nextLine();

		if (area.equals("T")) {
			System.out.print("반지름을 입력하세요 : ");
			int r = sc.nextInt();
			System.out.println("윈의 면적 값은 " + (r * r * Math.PI));
		}

		if (area.equals("R") || area.equals("C")) {
			System.out.print("첫번째 숫자를 입력하세요 : ");
			int x = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 : ");
			int y = sc.nextInt();

			if (area.equals("R")) {
				System.out.println("사각형의 면적은 " + (x * y));

			} else if (area.equals("C")) {
				System.out.println("삼각형의 면적은 " + ((x * y) / 2));

			} else {
				System.out.println("R, C, T 중에 입력하세요");

			}
		}
		sc.close();
	}
}
