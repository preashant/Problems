package Problems;

import java.util.Scanner;

public class FactorsOfGivenNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}

	}

}
