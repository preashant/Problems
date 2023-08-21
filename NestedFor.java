package Problems;

public class NestedFor {
	public static void main(String[] args) {
		int num1=5;
		int num2=4;
		for(int i=0;i<num2;i++)
		{
			System.out.print(i+":");
			for(int j=0;j<num2;j++)
			{
				System.out.print(j);
				if(j<num2-1)
				{
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

}
