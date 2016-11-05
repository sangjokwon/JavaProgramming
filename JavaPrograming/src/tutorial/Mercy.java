package tutorial;

import java.util.Scanner;

public class Mercy {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Mercy mercy = new Mercy();
        while(true) {
        	int cases = sc.nextInt();
        	mercy.solution(cases);
        }
		
		
	}
	
	public void solution(int cases) {
		for(int i=0; i<cases ; i++){
			System.out.printf("hello\n");
			System.out.println("hello world");
		}
	}
}
