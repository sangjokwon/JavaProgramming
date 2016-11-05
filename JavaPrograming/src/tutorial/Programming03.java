package tutorial;

import java.util.Scanner;

public class Programming03 {
	public static void main(String[] args) {

		double volume;

		System.out.print("�������� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		volume = r * r * r * 4 / 3;

		System.out.println("���� ���Ǵ� " + r * r * r * 4 / 3 + " �Դϴ�");
		System.out.println(volume);
		sc.close();
	}

}
