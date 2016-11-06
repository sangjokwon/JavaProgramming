package tutorial.chapter01;

public class Programming32 {
	public static void main(String[] args) {

		int i = 0;
		int sam = 1;
		while (i < 101) {
			if (i % 3 == sam)
				System.out.print(" " + i);
			i++;
		}
		System.out.println();
		for (i = 0; i < 101; i++) {
			if (i % 3 == sam)
				System.out.print(i + " ");

		}
	}

}
