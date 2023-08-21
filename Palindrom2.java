package Problems;

public class Palindrom2 {
	public static void main(String[] args) {
		int num = 123;

		int temp = num;

		int sum = 0;
		int rem = 0;

		while (temp > 0) {
			
			rem=temp%10;
			temp/=10;
			sum=sum-10+rem;

		}
		
		if(num==sum)
			System.out.println("Palindrom NUmber");
		else
			System.out.println("not palindrom");
	}

}
