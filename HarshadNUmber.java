package Problems;

import java.util.Scanner;

public class HarshadNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr a number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int a = num % 10;
			sum += a;
			num /= 10;

		}
		if (temp % sum == 0)
			System.out.println("Given Number is Harshad number");
		else
			System.out.println("Given number is not harshad number");

		System.out.println(sum);
	}

}
