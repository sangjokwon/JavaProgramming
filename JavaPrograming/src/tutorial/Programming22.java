package tutorial;

import java.util.Scanner;

public class Programming22 {
	public static void main(String[] args) {

		double AC, AE, BC, X, Y;

		Scanner sc = new Scanner(System.in);
		// �ﰢ�� ABC �� �ﰢ�� ADE, AC:AE=BC:DE
		System.out.print("�� AC�� ���� �Է��ϼ��� : ");
		AC = sc.nextDouble();
		System.out.print("�� AE�� ���� �Է��ϼ��� : ");
		AE = sc.nextDouble();
		System.out.print("�� BC�� ���� �Է��ϼ��� : ");
		BC = sc.nextDouble();

		X = AE * BC;
		Y = X / AC;

		System.out.print("��DE�� ���̴� : " + Y);

		sc.close();
	}

}
