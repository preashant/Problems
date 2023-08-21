package Problems;

public class Probleam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=100;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 || i%7==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
