package Problems;

public class Patter4 {
	public static void main(String[] args) {

		int space = 3;
		int star = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
				
			}
			star+=2;
			space--;
			System.out.println();

		}

	}

}
