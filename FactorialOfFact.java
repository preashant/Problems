package Problems;

public class FactorialOfFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=5;
		int fact2=1;
		
		int n=2;
		int factorial=1;
		while(fact>1)
		{
			factorial*=fact;
			fact--;
		}
		//System.out.println(factorial);
		int power=0;
		while(true)
		{
			int number=(int)Math.pow(n, power);
			if(factorial%2!=0)
			{
				break;
			}
			else
		      power++;
				
		}
	}
}
