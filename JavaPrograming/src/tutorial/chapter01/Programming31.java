package tutorial.chapter01;

import java.util.Scanner;

public class Programming31 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("X 의 값을 입력하세요 : ");
		double x = sc.nextDouble();

		if (x > 0) {
			System.out.println(7 * x + 2);
		} else if (x <= 0)
			System.out.println(x * x * x - 9 * x + 2);
		
		sc.close();
	}

}
