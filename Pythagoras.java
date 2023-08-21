package Problems;

public class Pythagoras {
	
	public static void main(String[] args) {
		for(int a=1;a<=20;a++)
		{
			for(int b=a+1;b<=20;b++)
			{
				int num=(a*a)+(b*b);
				int sqrt=(int) Math.sqrt(num);
				int sq=sqrt*sqrt;
				if(sq==num && sqrt<=20)
					
				{
				  System.out.println(a+" "+b+" "+sqrt);	
				}
			}
		}
	}

}
