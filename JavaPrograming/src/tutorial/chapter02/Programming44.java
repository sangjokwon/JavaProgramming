package tutorial.chapter02;

import java.util.Scanner;

public class Programming44 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ID1 = "kwon", PW1 = "sangjo";

		System.out.print("ID 를 입력 하세요 : ");
		String id = sc.nextLine();

		System.out.print("PW 를 입력 하세요 : ");
		String pw = sc.nextLine();

		if (id.equals(ID1)) {
			System.out.println("아이디가 일치 합니다");
		} else
			System.out.println("아이디가 불일치 합니다");
		{
			if (pw.equals(PW1)) {
				if (id.equals(ID1) && pw.equals(PW1)) {
					System.out.println("비밀번호가 일치 합니다");
					System.out.println("로그인 되었습니다");
				}
			} else if (!pw.equals(PW1))
				System.out.println("비밀번호가 불일치 합니다");
		}
		sc.close();
	}
}
