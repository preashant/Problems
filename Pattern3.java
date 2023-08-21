package Problems;

public class Pattern3 {
	public static void main(String[] args) {

		for (int i = 7; i > 0; i--) {
			if ((i >= 5)) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			} else
				System.out.println("*");
			System.out.println();
		}

	}

}
