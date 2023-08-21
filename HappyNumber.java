package Problems;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 68;
		int sum = 0;
		while (true) 
		{
			int temp = num;
			while (temp > 0) 
			{
				int s = temp % 10;
				//System.out.println(s);
				int sq = s * s;
				sum += sq;
				temp /= 10;
				num = sum;
			}
			System.out.println(num);
			//break;
			  if(num==1) 
			  {
				  System.out.println("Happy Number");
				  break; 
				  } 
			  else if(num>=2&&sum<=9) 
			  {
				  System.out.println("Not Happy Number"); 
				  break; 
				  
			  }
			 
		}
	}

}
