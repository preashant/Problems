package Problems;

public class NumberSeries6 {
	public static void main(String[] args) {
		int a=3;
		int b=0;
		int c=2;
		
		int ct=10;
		for(int i=1;i<=ct;i++)
		{
			System.out.println(a+c);
			int d=a+c;
			a=b;
			b=c;
			c=d;
			
		}
	}

}
