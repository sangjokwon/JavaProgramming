package tutorial;

import java.util.Scanner;

public class Programming18 {
	public static void main(String[] args) {
		int su, th, hun, ten, one;

		Scanner sc = new Scanner(System.in);

		System.out.print("10000���� ���� ������ �Է��ϼ��� : ");
		su = sc.nextInt();

		th = su / 1000;
		hun = su % 1000 / 100;
		ten = su % 100 / 10;
		one = su % 10;

		System.out.println("õ�� �ڸ� : " + th);
		System.out.println("���� �ڸ� : " + hun);
		System.out.println("���� �ڸ� : " + ten);
		System.out.println("���� �ڸ� : " + one);

		sc.close();

	}
}