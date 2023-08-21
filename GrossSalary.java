package Problems;

public class GrossSalary {
         public static void main(String[] args) {
			
        	 float bSal=5000.0f;
        	 
        	 float hra=0.0f;
        	 float da=0.0f;
        	 
        	 if(bSal<=10000)
        	 {
        		 hra=(float) (bSal*0.20);
        		 da=(float) (bSal*0.8);
        	 }
        	 else if(bSal<=20000)
        	 {
        		 hra=(float) (bSal*0.25);
        		 da=(float) (bSal*0.9);
        	 }
        	 else 
        	 {
        		 hra=(float) (bSal*0.30);
        		 da=(float) (bSal*0.95);
        	 }
        	 
        	 float groosSal=bSal+hra+da;
        	 System.out.println("Total Salary: "+groosSal);
        	 
        	 
		}
}
