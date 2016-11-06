package tutorial.chapter01;

public class Programming35 {
	public static void main(String[] args) {

		for (int i = 1; i < 100; i++)
			for (int j = 1; j < 100; j++)
				for (int k = 1; k <= 100; k++)
					if (k * k == i * i + j * j) {

						System.out.println("a : " + i + " b : " + j + " c : " + k);
					}
	}
}
