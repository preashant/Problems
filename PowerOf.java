package Problems;

import java.util.Scanner;

public class PowerOf {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enetr a Base");
		int base=scan.nextInt();
		System.out.println("enetr exponent");
		int exp=scan.nextInt();
		
		/*
		 * double power=1;
		 * 
		 * for(int i=1;i<=exp;i++) { power*=base; }
		 */
		long power=(long) Math.pow(base, exp);
		System.out.println(power);
	}

}
