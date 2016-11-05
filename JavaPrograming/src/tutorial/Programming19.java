package tutorial;

import java.util.Scanner;

public class Programming19 {
	public static void main(String[] args) {
		int start, end, fuel, efficiency;

		Scanner sc = new Scanner(System.in);

		System.out.print("출발한 지점의 주행 거리계 : ");
		start = sc.nextInt();
		System.out.print("도착한 지점의 주행 거리계 : ");
		end = sc.nextInt();
		System.out.print("사용한 연료 : ");
		fuel = sc.nextInt();

		efficiency = (end - start) / fuel;

		System.out.print("연비는 " + efficiency + "Km/1 입니다");

		sc.close();

	}

}
