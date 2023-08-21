package Problems;

public class Probleam5 {
public static void main(String[] args) {
	int num=4;
	
	for(int a=0;a<=num;a++)
		for(int b=0;b<=num;b++)
			for(int c=0;c<=num;c++)
				if(a+b+c==num)
					System.out.println(a+" "+b+" "+c);
}
}
