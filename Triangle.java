package Problems;

public class Triangle {
	double side1;
	double side2;
	double side3;
	
	public Triangle(double side1) {

		this.side1 = side1;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		System.out.println("side1: "+side1 +" side2: "+side2+" side3: "+side3);
	}
	
	public void trianglePerimeter()
	{
		double per=side1+side2+side3;
		System.out.println("Triangle Perimeter "+per);
	}
	public boolean isEquilatreal()
	{
		if(side1==side2 && side1==side3)
		{
			return true;
		}
		return false;
	}
	public double area()
	{
		double s=(side1+side2+side3)/2;
		
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}

}
