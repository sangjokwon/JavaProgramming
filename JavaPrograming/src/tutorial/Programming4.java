package tutorial;

import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {

		double C;

		System.out.print("ȭ���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		double F = sc.nextDouble();

		C = (F - 32) * 5 / 9;

		System.out.println("������ " + (F - 32) * 5 / 9 + " �Դϴ�");
		System.out.println(C);
		sc.close();
	}

}
