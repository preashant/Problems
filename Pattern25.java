package Problems;
/*
 *    *****
 *     ****
 *      ***
 *       **
 *        *
 */
public class Pattern25 {
	public static void main(String[] args) {
		int jRange=5;
		int iRange=9;
		for(int i=iRange;i>=1;i--)
		{
			if(i>=5)
			{
			for(int j=5;j<=(i/2)+1;j--)
			{
				System.out.print("&");
			}
			for(int k=jRange;k>=1;k--)
			{
				System.out.print("*");
			}
			jRange--;
			}
			System.out.println();
			
			
		}
			
	}

}