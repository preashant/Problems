package Problems;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		
		int sum=0;
		int add=0;
		while(num!=0)
		{
			 add=num%10;
			num/=10;
			sum+=add;
		}
		System.out.println(sum);

	}

}
