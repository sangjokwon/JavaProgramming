package tutorial;

import java.util.Scanner;

public class Programming13 {
	public static void main(String[] args) {
		final double pyeong = 3.3;
		int x;
		double m;
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");

		x = sc.nextInt();
		m = pyeong * x;

		System.out.print("�Ŀ�带 �׷����� ȯ���ϸ� : " + m + " M^2 �Դϴ�");
		sc.close();
	}
}
