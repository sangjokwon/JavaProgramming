package tutorial.chapter01;

import java.util.Scanner;

public class Programming24 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("+, -, *, / 를 입력하세요 : ");
		String sacik = sc.nextLine();

		System.out.print("첫번째 숫자를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int y = sc.nextInt();

		if (sacik.equals("+")) {
			System.out.println("+의 값은 " + (x + y));

		} else if (sacik.equals("-")) {
			System.out.println("- 의 값은" + (x - (-y)));

		} else if (sacik.equals("*")) {
			System.out.println("* 의 값은 " + (x * y));

		} else if (sacik.equals("/")) {
			if(y==0)
				System.out.println("분모는 0이 안됩니다");
			else
			System.out.println("/ 값은 " + (x / y));

		} else {
			System.out.println("+, -, X, / 중에 입력하세요");

		}sc.close();
	}
}
