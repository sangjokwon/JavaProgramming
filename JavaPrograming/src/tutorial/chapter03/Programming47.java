package tutorial.chapter03;

import java.util.Scanner;

//책 주사위 예제
class Dice {
	// 필드
	private int diceFace, userGuess;

	// 접근자
	public int gatdiceFace() {
		return diceFace;
	}

	// 설정자 선언
	public void setdiceFace(int _diceFace) {
		diceFace = _diceFace;
	}

	public int Roll() {
		diceFace = (int) (Math.random() * 6) + 1;
		return diceFace;
	}

	/*
	 * 사람에게 입력받기 private int getUserInput(String prompt) {
	 * System.out.println(prompt); Scanner sc = new Scanner(System.in); return
	 * sc.nextInt(); }
	 * 
	 * 
	 * private void checkUserGuess() { if (diceFace == userGuess)
	 * System.out.println("맞앗습니다"); else System.out.println("틀렸습니다"); } //입력받기
	 * public void startPlaying() { userGuess = getUserInput("예상값을 입력하시오 : ");
	 * //다이스 돌리기 Roll(); checkUserGuess(); }
	 */
	public String toString() {
		return "diceFace = " + diceFace + "\n";
	}
}

class test {
	private int diceFace1;

	public int Roll() {
		diceFace1 = (int) (Math.random() * 6) + 1;
		return diceFace1;

	}

	public String toString() {
		return "diceFace1 = " + diceFace1 + "\n";

	}
}

public class Programming47 {
	public static void main(String[] args) {
		Dice game = new Dice();
		// 사람에게 입력받기
		// game.startPlaying();
		// 사용자 고정입력 시키기
		game.setdiceFace(4);
		System.out.print(game.toString());

		// 다이스 돌리기
		game.Roll();
		System.out.println(game.toString());

		test onetest = new test();
		onetest.Roll();
		System.out.print(onetest.toString());

	}
}
