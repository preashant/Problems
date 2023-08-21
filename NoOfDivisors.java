package Problems;

public class NoOfDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=30;
		int  count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				if(i%3==0)
				count++;
				
		}
		System.out.println(count);

	}

}
