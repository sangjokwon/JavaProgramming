package tutorial;

import java.util.Scanner;

public class Programming17 {
	public static void main(String[] args) {
		int high, feet2;
		float inch = 2.54f;
		float feet = 12 * inch;
		float inch2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Ű�� cm������ �Է��ϼ��� : ");
		high = sc.nextInt();

		feet2 = (int) (high / feet);
		inch2 = (high - feet2 * feet) / inch;

		System.out.println(+high + "cm�� " + feet2 + "��Ʈ " + inch2 + "��ġ�Դϴ�.");

		sc.close();
	}

}
