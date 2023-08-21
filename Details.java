package Problems;

import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
		
       Scanner scn=new Scanner(System.in);
       
       System.out.println("Enetr your Full Name ");
       String name=scn.nextLine();
       
       System.out.print("Enter your Phone number");
       long phone=scn.nextLong();
       
       System.out.println("Enetr your age");
       int age=scn.nextInt();
       
       System.out.println("Enetr yor id Number");
       int id=scn.nextInt();
       
       
       scn.close();
	}
}
