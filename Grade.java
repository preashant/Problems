package Problems;

public class Grade {
	public static void main(String[] args) {
		
		float m1,m2,c1,c2,e,total,average,percentage;
		
		m1=55;
		m2=60;
		c1=65;
		c2=56;
		e=45;
		total=m1+m2+c1+c2+e;
		
		average=total/5;
		
		percentage=(total/500)*100;
		
		System.out.println("Avrage: "+average);
		System.out.println("Percentage: "+percentage);
		
		
		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage<90 && percentage>=80 )
		{
			System.out.println("Grade B");
		}
		else if(percentage<80 && percentage>=70 )
		{
			System.out.println("Grade C");
		}
		else if(percentage<70 && percentage>=50 )
		{
			System.out.println("Grade E");
		}
		else 
		{
			System.out.println("Grade F");
		}
		
	}

}
