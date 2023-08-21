package Problems;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=18;
		int num2=12;
		
		int start=0;
		
		if(num1<num2)
			start=num1;
		else
			start=num2;
		
		for(int i=start; ;i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
