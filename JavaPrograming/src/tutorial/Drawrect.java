package tutorial;

import java.util.Scanner;

public class Drawrect {
/*
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-- > 0) {
            String name = sc.next();
            System.out.println("Hello, " + name + "!");
        }
    }
 */
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[][] arrayx = new int[count][3];
		int[][] arrayy = new int[count][3];	
		for(int i=0; i<count; i++){
			for(int j=0; j<3; j++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				arrayx[i][j] = x;
				arrayy[i][j] = y;
			}
		}
		for(int i=0; i<count; i++){
			for(int j=0; j<3; j++){
				System.out.println(arrayx[i][j] + " " + arrayy[i][j]);
			}
		}
		
		
	}
}
