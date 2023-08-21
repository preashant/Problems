package Problems;
public class BellNum {
	public static void main(String[] args) {
		int c;
		int a=1;
		int b=0;
		
		for(int i=1;i<10;i++)
		{
			System.out.print(b+" ");
			c=a+2*b;
			a=b;
			b=c;
		}
		
	}

}
