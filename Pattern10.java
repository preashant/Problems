package Problems;

public class Pattern10 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
			}
			else if(i>=5)
				for(int k=6;k>=n;k--)
				{
					System.out.print("*");
					
				}
			System.out.println();
		}
	}

}
