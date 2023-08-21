package Problems;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		scan.close();
		
		int rem=0;
		int reverse = 0;
		while (num > 0) 
		{
 			 rem = num % 10;
 			 
			num=num/ 10;
			
			reverse = reverse * 10 + rem;

		}
		System.out.println(reverse);

	}

}
