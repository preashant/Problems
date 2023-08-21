package Problems;
import  java.lang.Math.*;
import java.util.Scanner;

public class NUmberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr a number");
		int num = sc.nextInt();
            int value=Math.abs(num);
		int count = 0;
		while (value > 0) 
		{
			count++;
			num /= 10;
		}

		System.out.println("Number of digits are " + count);
	}

}
