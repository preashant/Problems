package Problems;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enetr a number to check");
		
		int num = scan.nextInt();
		
		scan.close();
		//boolean var = false;
		int number=1;
		int square = num * num;
		int temp = square;
		int c = 10;
		while (temp > 0) 
		{
			int a = square;
			int n = square % c;
			a /= c;
			if ((n + a) == num) {
				//var = true;
				number=2;
				break;
			}
			temp /= 10;
			c *= 10;
		}
		if (number==2)
			System.out.println("Kaprekar Number");
		else
			System.out.println("Not Kaprekar Number");

	}

}
