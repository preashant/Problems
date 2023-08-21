package Problems;

public class LCM {
	public static void main(String[] args) {
		
		int num1=18;
		int num2=12;
		int start=0;
		
		if(num1>num2)
			start=num1;
		else
			start=num2;
		
		for(int i=start; ; i++)
		{
			if(i%num1==0 && i%num2==0)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
