package Problems;

public class NumberOfDigits2 {
	public static void main(String[] args) {
		
		int num=1235;
		
		int ct=1;
		
		for(int i=ct;num>0;i++)
		{
			num/=10;
			ct=i;
		}
		
		System.out.println("number of digits are "+ct);
	}

}
