package tutorial;

import java.util.Scanner;

public class Programming20 {

	public static void main(String[] args) {
		int r, h;
		double volume;
		final double PI = 3.14;

		Scanner sc = new Scanner(System.in);

		System.out.print("����� �ظ��� �������� �Է��Ͻÿ� : ");
		r = sc.nextInt();
		System.out.print("������� ���̸� �Է��Ͻÿ� : ");
		h = sc.nextInt();

		volume = r * r * PI * h;

		System.out.println("������� ���Ǵ� " + volume + "�Դϴ�");

		sc.close();
	}

}
