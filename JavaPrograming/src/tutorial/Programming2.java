package tutorial;

import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {

		double cm;

		System.out.print("��ġ�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		double inch = sc.nextDouble();

		cm =inch * 2.54;

		System.out.println("1��ġ�� " + inch*2.54 + " cm �Դϴ�");
		System.out.println(cm +" cm");
		sc.close();
	}

}
