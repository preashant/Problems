//2,12,36,80,150,252,392
package Problems;

public class NumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int n=10;
	        int diff1=10;
	        int diff2=14;
	        int diff3=6;
	        int num=2;
	        
	        for(int i=1;i<=n;i++)
	        {
	        	System.out.print(num+" ");
	        	//num=i*i + i*i*i;
	        	num=num+diff1;
	        	 
	        	diff1=diff1+diff2;
	        	diff2=diff2+diff3;  	
	        }
	        

	}

}
