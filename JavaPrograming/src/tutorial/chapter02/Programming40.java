package tutorial.chapter02;

import java.util.Scanner;

public class Programming40 {
	public static void main(String[] args) {
		int eng, num, space;
		eng = num = space = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열를 입력하세요 : ");
		String syn = sc.nextLine();

		for (int i = 0; i < syn.length(); i++) {

			if (('a' <= syn.charAt(i) && syn.charAt(i) <= 'z') || ('A' <= syn.charAt(i) && syn.charAt(i) <= 'Z')) {
				eng++;
			} else if ('0' <= syn.charAt(i) && syn.charAt(i) <= '9') {
				num++;
			} else if (' ' == syn.charAt(i))
				space++;
		}
		System.out.println("알파벳 : " + eng + "개");
		System.out.println("숫자 : " + num + "개");
		System.out.println("공백 : " + space + "개");
		sc.close();
	}

}
