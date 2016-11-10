package tutorial.chapter03;

import java.util.Scanner;

class Triangle {
	int width = 0, high = 0, area = 0;

	public int width() {
		return width;
	}

	public int high() {
		return high;
	}

	// 설정자 선언
	public void setWidth(int set_width) {
		width = set_width;
	}

	public void setHigh(int set_high) {
		high = set_high;
	}

	int getArea() {
		return width * high / 2;
	}
}

public class Programming52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle tri = new Triangle();
		
		System.out.println("밈변 입력 : ");
		tri.setWidth(sc.nextInt());
		System.out.println("높이 입력 : ");
		tri.setHigh(sc.nextInt());
		
		System.out.println("넓이는 : " + tri.getArea());
	}

}
