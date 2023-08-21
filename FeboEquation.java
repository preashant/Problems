package Problems;

public class FeboEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pmil=1;
		int newNum=1;
		
		int count =0;
		
		while(count<5)
		{
			int newMul2=(newNum*pmil)+1;
			System.out.println(newMul2);
			
			pmil=pmil*newNum;
			
			newNum=newMul2;
			count++;
			
		}
	}	
}
