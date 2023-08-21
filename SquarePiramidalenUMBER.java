package Problems;

public class SquarePiramidalenUMBER {
	public static void main(String[] args) {
		
		int num=5;
		int ip=55;
		
		for(int i=1;i<=num;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				sum+=j*j;
			}
			if(sum==ip)
			{
				System.out.println(i);
				break;
			}
			if(sum>ip)
			{
				System.out.println("-1");
				break;
			}
		}
	}

}
