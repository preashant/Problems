package Problems;
/*
 * E E E E E
 * F F F F
 * G G G
 * H H
 * I
 */
public class Pattern24 {
	public static void main(String[] args) {
		
		char ch='F';
		for(int i=5;i>=0;i--)
		{ ch='F';
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch--);
			}
			System.out.println();
			ch++;
		}
	}

}
