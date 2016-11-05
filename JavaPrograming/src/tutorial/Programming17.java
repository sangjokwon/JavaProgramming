package tutorial;

import java.util.Scanner;

public class Programming17 {
	public static void main(String[] args) {
		int high, feet2;
		float inch = 2.54f;
		float feet = 12 * inch;
		float inch2;

		Scanner sc = new Scanner(System.in);

		System.out.print("키를 cm단위로 입력하세요 : ");
		high = sc.nextInt();

		feet2 = (int) (high / feet);
		inch2 = (high - feet2 * feet) / inch;

		System.out.println(+high + "cm는 " + feet2 + "피트 " + inch2 + "인치입니다.");

		sc.close();
	}

}
