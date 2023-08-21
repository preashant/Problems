package Problems;

import java.util.Scanner;

public class SampleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int p=1234; float r=0.20f; int t=2;
		 */
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enetr amount");
		int a=scn.nextInt();
		
		System.out.println("Enetr interesr");
		float i=scn.nextFloat();
		
		System.out.println("Enetr Time");
		int t=scn.nextInt();
		
		float sampleInterest=(a*i*t);
	}

}
