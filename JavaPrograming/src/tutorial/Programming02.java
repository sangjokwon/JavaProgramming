package tutorial;

import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {

		double cm;

		System.out.print("인치를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		double inch = sc.nextDouble();

		cm =inch * 2.54;

		System.out.println("1인치는 " + inch*2.54 + " cm 입니다");
		System.out.println(cm +" cm");
		sc.close();
	}

}
