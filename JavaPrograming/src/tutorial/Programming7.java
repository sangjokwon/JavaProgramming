package tutorial;

import java.util.Scanner;

public class Programming7 {
	public static void main(String[] args) {

		int y;

		System.out.print("x�ǰ��� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		y = 3 * x * x + 7 * x + 11;

		System.out.println("3x^2 + 7*x + 11 �������  " + y);
		sc.close();
	}

}
