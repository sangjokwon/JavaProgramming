package tutorial;

import java.util.Scanner;

public class Programming21 {
	public static void main(String[] args) {

		double won, interest, intemoney;

		Scanner sc = new Scanner(System.in);

		System.out.print("���ݾ��� �Է��Ͻÿ� : ");
		won = sc.nextDouble();
		System.out.print("�������� �Է��Ͻÿ�(���� �ۼ�Ʈ): ");
		interest = sc.nextDouble();

		for (int year = 1; year < 3; year++) {
			won = won + (won * interest / 100);
			System.out.println(year + "�� ���� ���ݾ���" + won + "�Դϴ�.");
		}
		sc.close();
	}

}
