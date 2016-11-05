package tutorial;

import java.util.Scanner;

public class Programming11 {
	public static void main(String[] args) {
		double x, y;

		Scanner sc = new Scanner(System.in);

		System.out.print("½Ç¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		x = sc.nextDouble();

		y = 3 * x * x * x - 7 * x * x + 9;

		System.out.println("3 * x * x * x -7 * x * x + 9  °ª : " + y);

		sc.close();
	}

}