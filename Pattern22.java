package Problems;
/*
 * E E E E E
 * F F F F
 * G G G
 * H H
 * I
 */
public class Pattern22 {
	public static void main(String[] args) {
		
		char ch='A';
		for(int i=1;i<=5;i++)
		{ 
			for(int j=5;j>=i;j--)
			{
				System.out.print((char)(ch+4));
			}
			System.out.println();
			ch++;
		}
	}

}
