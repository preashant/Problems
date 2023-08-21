package Problems;

import java.util.Scanner;

public class Factoraial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr a number");
		int num = sc.nextInt();

		if (num >= 0) 
		{
			int fact = 1;

			for (int k = num; k > 1; k--) 
			{
				fact *= k;
			}

			System.out.println("factorial of " + num + " is= " + fact);
		} 
		else
			System.out.println("Invalid input");

	}

}
