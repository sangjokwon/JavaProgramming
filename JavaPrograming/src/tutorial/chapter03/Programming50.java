package tutorial.chapter03;

import java.util.Scanner;

class Cellphone {
	private String model, color, maker, camera;
	boolean power = false;

	// 접근자 선언
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getMaker() {
		return maker;
	}

	public String getCaemra() {
		return camera;
	}

	// 설정자 선언
	public void setmodel(String set_model) {
		model = set_model;
	}

	public void setcolor(String set_color) {
		color = set_color;
	}

	public void setmaker(String set_maker) {
		maker = set_maker;
	}

	public void setcamera(String set_camera) {
		camera = set_camera;
	}

	String power() {
		if (power == false) {
			power = true;
			return "핸드폰을 시작합니다";
		} else {
			power = false;
			return "핸드폰을 종료합니다";
		}

	}
}

public class Programming50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cellphone myphone = new Cellphone();

		System.out.println("모델명을 입력하세요 : ");
		myphone.setmodel(sc.nextLine());
		System.out.println("color를 입력하세요 : ");
		myphone.setcolor(sc.nextLine());
		System.out.println("제조사를 입력하세요 : ");
		myphone.setmaker(sc.nextLine());
		System.out.println("카메라 유무를 입력하세요 : ");
		myphone.setcamera(sc.nextLine());

		System.out.println(myphone.power());
		System.out.println("모델 : " + myphone.getModel() + " 색상 : " + myphone.getColor() + " 제조사 : " + myphone.getMaker()
				+ " 카메라유무  : " + myphone.getCaemra());
		System.out.println(myphone.power());
	}

}
