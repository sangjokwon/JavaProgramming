package tutorial;

import java.util.Scanner;

public class Programming09 {
	public static void main(String[] args) {

		int tax, jandon;

		Scanner sc = new Scanner(System.in);
		System.out.print("받은 돈을 입력하세요 : ");
		int won = sc.nextInt();
		System.out.print("상품의 총액을 입력하세요 : ");

		int price = sc.nextInt();

		tax = price / 10;
		jandon = won - price;

		System.out.println("받은 돈 : " + won);
		System.out.println("상품의 총액 : " + price);
		System.out.println("부가세  : " + tax);
		System.out.println("잔돈 : " + jandon);
		sc.close();
	}

}