package tutorial.chapter03;

import java.util.Scanner;

class complex {
	private double sil, hu;

	public double getsil() {
		return sil;
	}
	public double gethu() {
		return hu;
	}

	// 설정자 선언
	public void setSil(double set_sil) {
		sil = set_sil;
	}
	public void setHu(double set_hu) {
		hu = set_hu;
	}
	
	public String toString(String bu) {
		return sil + bu + hu + "i";
	}
}

public class Programming51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		complex comp = new complex();

		System.out.println("실수를 입력");
		comp.setSil(sc.nextDouble());

		System.out.println("허수를 입력");
		comp.setHu(sc.nextDouble());
		
		System.out.println("+ 또는 -를 입력하세요");
		System.out.println("입력하신 값은 " + comp.toString(sc.next()));
	}

}
