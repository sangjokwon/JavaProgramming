package tutorial;

import java.util.Scanner;

public class Programming16 {
	public static void main(String[] args) {
		int cpu, clang, eng, math;
		double avg;

		Scanner sc = new Scanner(System.in);

		System.out.print("��ǻ�� ���� ������ ������ �Է��Ͻÿ� : ");
		cpu = sc.nextInt();
		System.out.print("c��� ���α׷��� ������ ������ �Է��Ͻÿ� : ");
		clang = sc.nextInt();
		System.out.print("���� ������ ������ ������ �Է��Ͻÿ� : ");
		eng = sc.nextInt();
		System.out.print("���� ������ ������ �Է��Ͻÿ� : ");
		math = sc.nextInt();

		avg = (cpu + clang + eng + math) / 4;

		System.out.print("��� ������ " + avg + "�� �Դϴ�.");
		sc.close();
	}

}
