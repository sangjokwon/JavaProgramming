
package tutorial;

public class Programming15 {
	public static void main(String[] args) {

		double sunearth, light, time;
		// 지수표기법으로 표현하기
		System.out.println("지구에서 태양까지의 거리 1억 5천만km(1.5E8, 1.5E+6)");
		sunearth = 1.5E+8;
		System.out.println("빛의 속도는 초속 30만 km (3.0E5, 3.0E+5)");
		light = 3.0E+5;
		time = sunearth / light;

		System.out.println("도달까지의 초 : " + time + " 초 ");

	}

}