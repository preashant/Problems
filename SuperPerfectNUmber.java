package Problems;

public class SuperPerfectNUmber {
	public static void main(String[] args) {
		
		int n=8;
		int sfNum=sumOfFact(n);
		int sfsfNum=sumOfFact(sfNum);
		
		if(sfsfNum==2*n)
             System.out.println("SuperPerfectNumber");
		else
			System.out.println("Not");
		
	}
	public static int sumOfFact(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
