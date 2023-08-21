package Problems;

public class GCDOfFactors {
	public static void main(String[] args) {
		
		int num1=3;
		int num2=4;
		
		int fact1=fact(num1);
		int fact2=fact(num2);
		/*
		 * System.out.println(fact1); System.out.println(fact2);
		 */
		
		int gcd=GCD(fact1,fact2);
	}
	public static int fact(int num)
	{
		int fact = 1;

		for (int k = num; k > 1; k--) 
		{
			fact *= k;
		}
		return fact;

	}
	public static int GCD(int num1,int num2)
	{
		int gcd=0;
	int start=0;
	
	if(num1<num2)
		start=num1;
	else
		start=num2;
	
	for(int i=start; ;i--)
	{
		if(num1%i==0 && num2%i==0)
		{
			System.out.println(i);
			gcd=i;
			break;
		}
	}
	return gcd;
	}

}
