package tutorial;

import java.util.Scanner;

public class Programming19 {
	public static void main(String[] args) {
		int start, end, fuel, efficiency;

		Scanner sc = new Scanner(System.in);

		System.out.print("����� ������ ���� �Ÿ��� : ");
		start = sc.nextInt();
		System.out.print("������ ������ ���� �Ÿ��� : ");
		end = sc.nextInt();
		System.out.print("����� ���� : ");
		fuel = sc.nextInt();

		efficiency = (end - start) / fuel;

		System.out.print("����� " + efficiency + "Km/1 �Դϴ�");

		sc.close();

	}

}
