package tutorial;

import java.util.Scanner;

public class Programming10 {
	public static void main(String[] args) {

		int x, y, h, volume;
		Scanner sc = new Scanner(System.in);

		System.out.print("길이를 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("너비를 입력하세요 : ");
		y = sc.nextInt();
		System.out.print("높이를 입력하세요 : ");
		h = sc.nextInt();

		volume = x * y * h;

		if (x >= 100 || y >= 100 || h >= 100) {
			System.out.println("100보다 작은 수를 입력");
		} else {
			System.out.println("부피 : " + volume);
		}
// for 한번 돌려봣습니다.
		for (int i = 0; i < 1; i++) {
			System.out.print("길이를 입력하세요 : ");
			x = sc.nextInt();
			System.out.print("너비를 입력하세요 : ");
			y = sc.nextInt();
			System.out.print("높이를 입력하세요 : ");
			h = sc.nextInt();
			volume = x * y * h;

			if (x >= 100) {
				System.out.println("100보다 작은 수를 입력");
				i = i - 1;
				continue;
			} else if (y >= 100) {
				System.out.println("100보다 작은 수를 입력");
				i = i - 1;
				continue;
			} else if (h >= 100) {
				System.out.println("100보다 작은 수를 입력");
				i = i - 1;
				continue;
			} else{
				System.out.println("부피 : " + volume);				
			}
			sc.close();

		}
	}
}
