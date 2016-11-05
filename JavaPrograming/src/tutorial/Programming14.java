
package tutorial;

import java.util.Scanner;

public class Programming14 {
	public static void main(String[] args) {

		int ss, h, m, s;

		Scanner sc = new Scanner(System.in);

		System.out.print("초를 입력하세요 : ");
		ss = sc.nextInt();
		h = ss / 3600;
		m = (ss - h * 3600) / 60;
		s = ss - h * 3600 - m * 60;
		System.out.print(+ss + " 초는 : " + h + "시간 " + m + "분 " + s + "초 입니다");

		sc.close();
	}

}