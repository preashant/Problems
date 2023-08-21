package Problems;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int k=1;k<=100;k++) {
		int count=0;
		//boolean flag=true;
		for(int i=2;i<=(k/2);i++)
		{
			if(k%i==0) {
			//flag=false;
				count++;
				break;
			}
				
		}		
		if(count==0)
		
			System.out.println(k+" The given number is Prime number");
		
		else
			System.out.println(k+" Number  is Not Prime number");

	}
	}

	}
