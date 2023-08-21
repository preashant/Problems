package Problems;

public class SumOfnthFacter {
	public static void main(String[] args) {
		
		int num=5;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			for(int d=1;d<=i;d++)
			{
				if(i%d==0)
					sum+=d;
			}
		}
		System.out.println(sum);
	}

}
