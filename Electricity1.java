package Problems;

public class Electricity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int units=230;
		float bill=0.0f;
		

			for(int j=1;j<=50;j++)
			{
				 bill+=0.50;
				
				 if(units==j)
				 {
					 break;
				 }
			}
            
			if(units>=51)
			{
			for(int j=51;j<=150;j++)
			{
				 bill+=0.75;
				 if(units==j)
				 {
					 break;
				 }
	       }
			}
          
			if(units>=151)
			{
			 for(int j=151;j<=250;j++)
			{
				 bill+=1.20;
				 if(units==j)
				 {
					 break;
				 }
	         }
			}
			  double totalBill=bill+0.20*bill;
				
				System.out.println(totalBill);
		}
	}
