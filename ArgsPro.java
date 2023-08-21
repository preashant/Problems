package Problems;

public class ArgsPro
{
	  public static void main(String [] args)
	  {
	   System.out.println("arguments length: "+args.length);
	   if(args.length>0)
	    System.out.println("Hello ");
	     for(int i=0;i<args.length;i++)
		  System.out.print(args[i]+", ");
	  } 
	}


