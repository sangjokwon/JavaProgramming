package tutorial;

import java.util.Scanner;

public class Programming16 {
	public static void main(String[] args) {
		int cpu, clang, eng, math;
		double avg;

		Scanner sc = new Scanner(System.in);

		System.out.print("컴퓨터 개론 과목의 점수를 입력하시오 : ");
		cpu = sc.nextInt();
		System.out.print("c언어 프로그래밍 과목의 점수를 입력하시오 : ");
		clang = sc.nextInt();
		System.out.print("영어 과목의 과목의 점수를 입력하시오 : ");
		eng = sc.nextInt();
		System.out.print("수학 과목의 점수를 입력하시오 : ");
		math = sc.nextInt();

		avg = (cpu + clang + eng + math) / 4;

		System.out.print("평균 점수는 " + avg + "점 입니다.");
		sc.close();
	}

}
