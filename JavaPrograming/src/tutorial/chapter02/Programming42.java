package tutorial.chapter02;

import java.util.Scanner;

public class Programming42 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단어를 입력 하세요 : ");
		String syn = sc.nextLine();
		int length = syn.length();

		for (int i = 0; i < length; i++) {
			System.out.print(syn.charAt(length - i - 1));
		} // charAt로 하나씩비교, i가 0이라 -1
		sc.close();
	}

}
