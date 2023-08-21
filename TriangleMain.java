package Problems;

public class TriangleMain {
	public static void main(String[] args) {
		 Triangle t1=new Triangle(2.5,5.6,5);
		 
		 t1.trianglePerimeter();
		 System.out.println();
		 System.out.println("isEquilateral: "+t1.isEquilatreal());
		 System.out.println();
		 System.out.println("Area: "+t1.area());
	}

}
