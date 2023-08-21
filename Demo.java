package Problems;
/*
 * 12321=12321
 * 12345=54321
 */
public class Demo {
	public static void main(String[] args) {
		
		int num=12345;
		
		int rem=0;
		int rev=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;      //rem=2
			rev=rev*10+rem;  //rev=12
			num=num/10;    //num=123
		}
		System.out.println(rev);
		System.out.println(num);
		if(temp==rev)
		{
			System.out.println("Palindrom");
		}
		else
			System.out.println("not");
		
	}

}
