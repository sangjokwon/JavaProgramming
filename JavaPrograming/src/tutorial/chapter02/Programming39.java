package tutorial.chapter02;

import java.util.Scanner;

public class Programming39 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 2; i++) {
			System.out.println("원의 반지름을 입력하세요 : ");
			int r = sc.nextInt();

			System.out.println("원의 넓이는 : " + r * r * Math.PI);

			System.out.println("사용자에게 계속하시겠습니까?(Y/N) : ");
			String item = sc.next();

			if (item.equals("Y") || item.equals("y")) {
				i = 1;
			} else if (item.equals("N") || item.equals("n")) {
				break;
			}

			i = 0;
		}sc.close();
	}

}
