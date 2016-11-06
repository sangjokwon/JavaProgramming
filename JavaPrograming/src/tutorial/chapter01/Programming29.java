package tutorial.chapter01;

import java.util.Scanner;

public class Programming29 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력하세요 : ");
		double stan = sc.nextDouble();
		System.out.println(stan);
		stan = (stan - 100) * 0.9;
		System.out.println("표준체중은 : " + stan);
		System.out.print("사용자의 몸무게를 입력하세요 : ");
		double kg = sc.nextInt();

		if (stan > kg)
			System.out.println("저체중 입니다");
		else if (stan == kg)
			System.out.println("표준입니다");
		else
			System.out.println("과체중입니다");
		
		sc.close();

	}
}
