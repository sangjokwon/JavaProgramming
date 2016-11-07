package tutorial.chapter02;

import java.util.Scanner;

public class Programming43 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int moum = 0, jaum = 0;

		System.out.print("단어를 입력 하세요 : ");
		String syn = sc.nextLine();

		for (int i = 0; i < syn.length(); i++) {
			String syn2 = syn.substring(i, i + 1);// substring(0,1) -> 1첫번째 문자만
													// 가져온다 0,2 면 2개까지
			char syn3 = syn.charAt(i);// charAt로 하나씩비교, i가 0이라 -1

			if (syn2.equalsIgnoreCase("a") == true // equalsIgnoreCase 대소문자 관계없이
													// 비교

					|| syn2.equalsIgnoreCase("e") == true || syn2.equalsIgnoreCase("i") == true
					|| syn2.equalsIgnoreCase("o") == true || syn2.equalsIgnoreCase("u") == true)
				moum++;
			else if (('a' <= syn3 && syn3 <= 'z') || ('A' <= syn3 && syn3 <= 'Z'))
				jaum++;
		}
		System.out.println("모음 : " + moum);
		System.out.println("자음 : " + jaum);
		sc.close();
	}
}
