package tutorial;

import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {

		double C;

		System.out.print("È­¾¾¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		Scanner sc = new Scanner(System.in);
		double F = sc.nextDouble();

		C = (F - 32) * 5 / 9;

		System.out.println("¼·¾¾´Â " + (F - 32) * 5 / 9 + " ÀÔ´Ï´Ù");
		System.out.println(C);
		sc.close();
	}

}
