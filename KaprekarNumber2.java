package Problems;

public class KaprekarNumber2 {
	public static void main(String[] args) {
		
		int num=45;
		int temp=num*num;
		int div=10;
		boolean isKaprekar=false;
		while(temp>0)
		{
			if((num*num)%div+(num*num)/div==num)
			{
				isKaprekar=true;
				break;
			}
			temp/=10;
			div*=10;
		}
		if(isKaprekar)
			System.out.println("Kaprekar Number");
		else
			System.out.println("not Kaprekar");
	}

}
