package Problems;

public class NumberSeries4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		
		int sum=0;
		int diff=2;
		int count=0;
		while(count<4)
		{
			sum+=num;
			num+=diff;
			count++;
			diff++;
		}
		System.out.println(sum);

		
	}

}
