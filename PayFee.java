
public class PayFee {

	public static void main(String[] args) {
	
		System.out.println("How much money are you dealing with?");
		double A = IO.readDouble();
		
		if ( A <= 500 ) {
			IO.outputDoubleAnswer(10);
		}
		
		else if (A<=5000 && A>500) {
			
			if ((A*.01) < 20) {
				IO.outputDoubleAnswer( 20);
			} else { 
			IO.outputDoubleAnswer(A*.01);
		} 
		}
		
		else if (A<=10000 && A > 5000) { 
			if ((A*.02) < 120) {
			IO.outputDoubleAnswer(120);
			} else {
			IO.outputDoubleAnswer((A*.02));
		}
		}
		
		else if (A >= 10000) {
			
			double tier1 = (10000*.02);
			double tier2 = ((10000*.02)+((A-10000)*.03));
			double tier3 = ((10000*.02)+(5000*.03)+((A-15000)*.04));
			
			if (A==10000) {
				IO.outputDoubleAnswer(tier1);
			}
			if (A>=10000 && A<15000) {
				IO.outputDoubleAnswer(tier2);
			}
			if (A>15000) {
				IO.outputDoubleAnswer(tier3);
			}
			

			
		
		}
	
	}
}