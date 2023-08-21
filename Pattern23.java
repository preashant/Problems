package Problems;
/*
 * E F G H I
 * F G H I
 * G H I
 * H I
 * I
 */
public class Pattern23 {
	public static void main(String[] args) {
		
		char ch='A';
		for(int i=4;i>=0;i--)
		{ 
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(ch+4+j));
			}
			ch++;
			System.out.println();
		}
	}

}

