package tutorial;

import java.util.Scanner;

public class Programming10 {
	public static void main(String[] args) {

		int x, y, h, volume;
		Scanner sc = new Scanner(System.in);

		System.out.print("���̸� �Է��ϼ��� : ");
		x = sc.nextInt();
		System.out.print("�ʺ� �Է��ϼ��� : ");
		y = sc.nextInt();
		System.out.print("���̸� �Է��ϼ��� : ");
		h = sc.nextInt();

		volume = x * y * h;

		if (x >= 100 || y >= 100 || h >= 100) {
			System.out.println("100���� ���� ���� �Է�");
		} else {
			System.out.println("���� : " + volume);
		}
// for �ѹ� �����f���ϴ�.
		for (int i = 0; i < 1; i++) {
			System.out.print("���̸� �Է��ϼ��� : ");
			x = sc.nextInt();
			System.out.print("�ʺ� �Է��ϼ��� : ");
			y = sc.nextInt();
			System.out.print("���̸� �Է��ϼ��� : ");
			h = sc.nextInt();
			volume = x * y * h;

			if (x >= 100) {
				System.out.println("100���� ���� ���� �Է�");
				i = i - 1;
				continue;
			} else if (y >= 100) {
				System.out.println("100���� ���� ���� �Է�");
				i = i - 1;
				continue;
			} else if (h >= 100) {
				System.out.println("100���� ���� ���� �Է�");
				i = i - 1;
				continue;
			} else{
				System.out.println("���� : " + volume);				
			}
			sc.close();

		}
	}
}
