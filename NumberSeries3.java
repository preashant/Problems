package Problems;
//1,1,1,2,1,2,3,1,2,3,4,1,2,3,4,5,1,2,3,4,5,6... and then print nth turm.
public class NumberSeries3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int ct = 0;

		outer: for (int i = 1;; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				ct++;
				if (ct == num) 
				{
					System.err.println(j);
					break outer;
				} 
			}
		}

	}

}
