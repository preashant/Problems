package Problems;

public class Pattern12 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			/*
			 * for(int j=2;j<=i;j++) 
			 * {
			 *  System.out.print(" "); 
			 *  } 
			 * for(int k=1;k<=1;k++) 
			 * {
			 * System.out.print("*"); 
			 * }
			 *  System.out.println();
			 */
			for(int j=1;j<=i;j++)
			if(i==j)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
			
			System.out.println();
		}
	}

}
