package Problems;

public class DesimalToBinary {
	public static void main(String[] args) {

		int num = 10;

		String s = "";

		while (num > 0) {
			int n = num % 2;
			//System.out.println(n);
			s = s + n;
			num /= 2;
		}
		
		  
		  char ch[]=s.toCharArray();
		  
		  for(int i=ch.length-1;i>=0;i--) 
		  { System.out.print(ch[i]); }
		 
	}

}
