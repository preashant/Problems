package Problems;
// i/p:105  o/p:15   sum of factors
public class SumOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=105;
		
		int sum=0;
		int fact=2;
		
		while(num>1)
		{
			if(num%fact==0)
			{
				sum+=fact;
				num/=fact;
			}
			else
				fact++;
		}
		System.out.println(sum);

	}

}
