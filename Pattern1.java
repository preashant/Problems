package Problems;

/*
    *     
   ***
  *****
 *******
  *****
   ***
    *
 *
*/
public class Pattern1 {
	public static void main(String[] args) {

		int space = 3;
		int star = 1; // i=1
						// j=1
						// k
		for (int i = 1; i <= 4; i++) // satr=3
										// space=2
		{
			for (int j = 1; j < space; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++)
			{
				System.out.print("*");
			}
			star += 2;
			space--;
			System.out.println();

		}
		int star1=5;
		int space1=1;
		for (int i = 1; i <= 3; i++) // satr=3
		// space=2
		{
			for (int j = 1; j <= space1; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= star1; k++)
			{
				System.out.print("*");
			}
			star1 -= 2;
			space++;
			System.out.println();

		}

	}

}
