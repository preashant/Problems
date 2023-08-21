package Problems;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int num1=sc.nextInt();
	     
		for(int i=1;i<=10;i++)
			{
			//int t=num1*i;
			//System.out.println(num1 +" * "+i+" = "+(num1*i) );
			System.out.printf("%d * %d = %d",num1,i,(num1*i));
			System.out.println();
			
			}
	}

}
