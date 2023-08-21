package Problems;

public class Pattern5 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			/*
			 * int k=1; 
			 * for(int j=0;j<=i;j++) 
			 * {
			 *  System.out.print(k+" "); 
			 *  k=k==0?1:0;
			 * }
			 * System.out.println();
			 */
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print("0"+" ");
				
				else
					System.out.print("1"+" ");
			}
			System.out.println();
		}
	}

}
