package tutorial;

import java.util.Scanner;

public class Programming1 {
	
	public static void main(String[] args){
		
		System.out.print("마일을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int mile = sc.nextInt();
		
		System.out.println(mile + "마일은 " + mile*1.609 + "km 입니다");
		
		sc.close();
	}

}
