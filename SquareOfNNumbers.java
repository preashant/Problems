package Problems;

public class SquareOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		

		for (int i = 0; i <= n; i++) 
		{
			int sum = 0;

			for (int j = 1; j <= i; j++) 
		{
				sum += i;
			}
			System.out.println(sum);
		}

	}

}
