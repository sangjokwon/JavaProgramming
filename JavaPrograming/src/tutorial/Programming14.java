package tutorial;

import java.util.Scanner;

public class Programming14 {
	public static void main(String[] args) {

		int ss, h, m, s;

		Scanner sc = new Scanner(System.in);

		System.out.print("�ʸ� �Է��ϼ��� : ");
		ss = sc.nextInt();
		h = ss / 3600;
		m = (ss - h * 3600) / 60;
		s = ss - h * 3600 - m * 60;
		System.out.print(+ss + " �ʴ� : " + h + "�ð� " + m + "�� " + s + "�� �Դϴ�");

		sc.close();
	}

}
