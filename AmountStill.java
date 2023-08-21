package Problems;

public class AmountStill {
	public static void main(String[] args) {
		int n=5;
		int k=10;
		
		int l=0;
		if(n%2==0)
	       l=n/2;
		else
			l=(n+1)/2;
		
		int amount=l*k;
		
		System.out.println(amount);
	}

}
