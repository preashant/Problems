package Problems;

public class Problem3 {
	public static void main(String[] args) {
		
		int n=5;
		int r=2;
		
		int nFact=calcFact(n);
		int nrFact=calcFact(n-r);
		
		int ans=nFact/nrFact;
		
		System.out.println(ans);
		
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
