package tutorial;

import java.util.Scanner;

public class Programming5 {
	public static void main(String[] args) {

		int xx, xxx;

		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		xx = x*x;
		xxx = x*x*x;

		System.out.println("������  : " + x*x +" ������ : " + x*x*x);
		System.out.println(xx + " " + xxx);
		sc.close();
	}

}

