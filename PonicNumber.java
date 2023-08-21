package Problems;

public class PonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int  diff=2;
		int count=0;
		
		while(count<=10)
		{
			num=num+diff;
			diff+=2;
			count++;
			if(count==10)
				System.out.println(num);
		}

	}

}
