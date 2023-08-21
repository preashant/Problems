package Problems;

public class Problem {
	public static void main(String[] args) {
		
		int num=5;
		int p=2;
		int fact=1;
		for(int i=2;i<=num;i++)
		{
		fact=fact*i;
		
		}
		int ct=0;
		while(true)
		{
			if(fact%p==0)
			{
				fact/=p;
				ct++;
			}
			else
				break;
		}
		
		System.out.println(ct);
	}

}
