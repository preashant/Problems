package Problems;

import java.util.Scanner;

public class RangOfEvenOdd {
	public static void main(String[] args) {
		
		Scanner pawar=new Scanner(System.in);
		
		System.out.println("Enetr starting point");
		int start=pawar.nextInt();
		System.out.println("Enetr ending point");
		int end=pawar.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.println("even :"+i);
			else
				System.out.println("odd :"+i);
		}
	}

}
