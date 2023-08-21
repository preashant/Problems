package Problems;

public class electricityBill {
	public static void main(String[] args) {
		
		int units=30;
		
		float totalBill, tBill,surcharge;
		
		if(units<=50)
		
		tBill= 50*0.50f;
			
		else if(units<=150)
			tBill=50*0.50f+(units-50)*0.75f;
		
		else if(units<=250)
			tBill=50*0.50f+100*0.75f+(units-150)*1.20f;
		
		else
			tBill=50*0.50f+100*0.75f+100*1.20f+(units-250)*1.50f;
		
		surcharge=tBill*0.20f;
		
		totalBill=tBill+surcharge;
		
		System.out.println("Total Electricity Bill is "+totalBill);
	}

}
