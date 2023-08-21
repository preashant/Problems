package Problems;
/*
 * 
 * 1
 * 2 6
 * 3 7 10 
 * 4 8 11
 * 5 9 12 13
 */
public class Pattern17 {
	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++)
		{
			int p=num;
		for(int j=1;j<=i;j++)
		{
			System.out.print(p+" ");
			p=p+5-j;
			
			
		} 
		System.out.println();
		num++;
		}
	}

}
