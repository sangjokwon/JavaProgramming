package tutorial;

import java.util.Scanner;

public class Programming1 {
	
	public static void main(String[] args){
		
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int mile = sc.nextInt();
		
		System.out.println(mile + "������ " + mile*1.609 + "km �Դϴ�");
		
		sc.close();
	}

}
