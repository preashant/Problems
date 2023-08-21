package Problems;

public class SCalculator {
          public static void main(String[] args) {
			
        	  int num1,num2;
        	  
        	  num1=34;
        	  num2=3;
        	  
        	  char ch='/';
        	  
        	  switch(ch)
        	  {
        	   case '+' :System.out.println(num1+num2);
        	             break;
        	             
        	   case '-' :System.out.println(num1-num2);
        	              break;
        	              
        	   case '*' :System.out.println(num1*num2);
        	               break;
        	               
        	   case '/' : System.out.println(num1/num2);
        	      break;
        	      
        	   case '%' : System.out.println(num1%num2);
        	      break;
        	      
        	    default : System.out.println("Invalid Input");
        	  }
		}
}
