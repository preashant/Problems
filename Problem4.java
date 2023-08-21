package Problems;

public class Problem4 {
	public static void main(String[] args) {
		
		int n=5;
		int nFact=calcFact(n);
		
		int max=0;
		
		for(int r=0;r<=n;r++)
		{
			int nrFact=calcFact(n-r);
			int rFact=calcFact(r);
			
			int ans= nFact/(nrFact*rFact);
			
			if(ans>max)
				max=ans;
			
		}
		System.out.println(max);
	}
	
	 public static int calcFact(int num)
	 {
		 int fact=1;
		 for(int i=2;i<=num;i++)
		 {
			 fact*=i;
		 }
		 return fact;
		 
	 }

}
