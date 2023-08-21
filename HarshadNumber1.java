package Problems;
public class HarshadNumber1 {
	public static void main(String[] args) { // TODO Auto-generated method stub
		int num=156;
		int temp=num;
		int sum=0;
		while(num!=0) 
		{
			sum+=( num % 10);
			num/=10;
		}
		if (temp%sum==0)
			System.out.println(temp+" Given Number is Harshad number");
		else
			System.out.println(temp+" Given number is not Harshad Num--ber");

	}

}
