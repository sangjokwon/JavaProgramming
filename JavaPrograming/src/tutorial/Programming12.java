package tutorial;

import java.util.Scanner;

public class Programming12 {
	public static void main(String[] args) {
		final double pound = 452;
		int x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ŀ�带 �Է��ϼ��� : ");

		x = sc.nextInt();
		y = pound * x;

		System.out.print("�Ŀ�带 �׷����� ȯ���ϸ� : " + y + "g �Դϴ�");
		sc.close();
	}

}
