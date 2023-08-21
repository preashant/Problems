package Problems;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
		
           int num;
		for(int k=1;k<=10;k++)
		{
			System.out.println("Enetr a number");
	            num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0) {
			flag=false;
				//count++;
				break;
			}
				
		}		
		if(flag)
		
			System.out.println(num+" The given number is Prime number");
		
		else
			System.out.println(num+" Number  is Not Prime number");
		
		System.out.println();
		}
	}

}
