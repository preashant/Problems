package Problems;

public class AdditionOfCoeficent {
	public static void main(String[] args) {
		
		int n=6;
		int r=1;
		int sum=0;
		for(int i=0;i<=n;i+=2)
		{
			int nfact=fact(n);
			int rnfact=fact(n-r);
			
			int a=nfact/rnfact;
			sum+=a;
		}
		System.err.println(sum);
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}

}
