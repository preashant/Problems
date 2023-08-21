package Problems;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		scan.close();
		int temp=num;
		int reverse = 0;
		
		//num=123;
		while (num > 0) {
 			int rem = num % 10;  rem=1
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					
 					;
			num =num/10;
			reverse = reverse * 10 + rem;

		}
		
		if(temp==reverse)
			System.out.println(reverse+" the number is palinddrom number");
		else
			System.out.println(reverse+" the number is not palindrom number");
	}

}
