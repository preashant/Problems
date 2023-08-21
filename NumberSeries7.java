package Problems;

public class NumberSeries7 {
	public static void main(String[] args) {
		int num=2;
		int diff1=10;
		int diff2=14;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num);
			num=num+diff1;
			diff1=diff1+diff2;
			diff2=diff2+6;
		}
	}

}
