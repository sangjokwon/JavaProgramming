package tutorial.chapter02;

import java.util.Scanner;

public class Programming38 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물품명 입력 (ex:TV1234) : ");
		String item = sc.nextLine();
		
		char s1 = item.charAt(0); //-인수번째의 문자를 읽어냄
		char s2 = item.charAt(1);
		
		 if(('A' <= s1 && s1<='Z' && 'A' <= s2 && s2<='Z')||
				 ('a' <= s1 && s1<='z' && 'a' <= s1 && s1<='z')){
			 System.out.println("앞의 두자리는 영어입니다");
		 }else 
			 System.out.println("앞의 두자리가 영어가 아닙니다");
		 
		 for(int i=0; i<item.length()-2;i++){
			 char n = item.charAt(2+i);
			 if('0' > n || n>'9'){
				 System.out.println("뒤의 네자리가 숫자가 아닙니다");
				 break;// 없으면 뒤에꺼 까지 실행됨
			 }else
				 if(i==item.length()-3)
					 System.out.println("뒤의 네자리가 숫자입니다");
		 }
		sc.close();
	}

}
