package Problems;

public class Febonacci {
	public static void main(String[] args) {
		int num=100;
		int ft=0;
		int st=1;
		int tt=0;
		
		System.out.print(ft+" "+st);
		
		for(int i=1;i<=num;i++)
		{
			tt=ft+st;
			ft=st;
			st=tt;
			System.out.print(" "+tt);
		}
	}

}
