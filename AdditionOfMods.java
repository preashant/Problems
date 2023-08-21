package Problems;

public class AdditionOfMods {
	public static void main(String[] args) {
		
		int n=10;
		int k=2;
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int mod=i%k;
			sum+=mod;
		}
		System.out.println(sum);
	}

}
