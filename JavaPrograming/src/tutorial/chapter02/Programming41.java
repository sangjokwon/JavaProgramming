package tutorial.chapter02;

import java.util.Scanner;

public class Programming41 {
	public static void main(String[] args) {
		
		int space = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어를 입력 하세요 : ");
		String syn = sc.nextLine();

		for (int i = 0; i < syn.length(); i++) {
			if (syn.charAt(i) == ' ')
				space++;
		}
		space++;

		System.out.println("단어의 수 :" + space + "개");

		sc.close();
	}

}
