package tutorial;

import java.util.Scanner;

public class Programming9 {
	public static void main(String[] args) {

		int tax, jandon;

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int won = sc.nextInt();
		System.out.print("��ǰ�� �Ѿ��� �Է��ϼ��� : ");

		int price = sc.nextInt();

		tax = price / 10;
		jandon = won - price;

		System.out.println("���� �� : " + won);
		System.out.println("��ǰ�� �Ѿ� : " + price);
		System.out.println("�ΰ���  : " + tax);
		System.out.println("�ܵ� : " + jandon);
		sc.close();
	}

}
