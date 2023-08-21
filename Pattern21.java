package Problems;
/*
 * A A A A A
 * B B B B
 * C C C
 * D D
 * E
 */
public class Pattern21 {
	public static void main(String[] args) {
		
		char ch='A';
		for(int i=1;i<=5;i++)
		{ 
			for(int j=5;j>=i;j--)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

}
