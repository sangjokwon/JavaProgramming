package tutorial;

import java.util.Scanner;

public class Programming23 {
	public static void main(String[] args) {
		int x, y, sabun;
		Scanner sc = new Scanner(System.in);

		System.out.print("x ��ǥ�� �Է��ϼ��� : ");
		x = sc.nextInt();

		System.out.print("y ��ǥ�� �Է��ϼ��� : ");
		y = sc.nextInt();

		sabun = (x > 0) ? (y > 0 ? 1 : 2) : (y > 0 ? 4 : 3);

		System.out.println(sabun + "��и�");

		sc.close();

	}

}
