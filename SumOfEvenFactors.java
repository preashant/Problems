package Problems;

public class SumOfEvenFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=30;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				if(i%2==0)
					sum+=i;
					
		}
		System.out.println(sum);

	}

}
