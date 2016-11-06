package tutorial.chapter01;

import java.util.Scanner;

public class Programming26 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건의 갯수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 10) 
			System.out.print("물건 " + num + "개의 값은 " + num * 100);
			else if(num>=10)
				System.out.println("물건 " + num + "개의 값은 " + ((num * 100) - (num*100/10)));
		
		sc.close();
	}
}