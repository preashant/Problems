package Problems;

public class BinaryToDecimal {
	public static void main(String[] args) {
		
		int num=1010;
		int sum=0;
		int mul=1;
		while(num>0)
		{
			int s=0;
			int n=num%10;
			while(mul>0)
			{
				 s=n*2;
				 mul--;
			}
			sum+=s;
			mul++;
			
		}
		System.out.println(sum);
	}

}
