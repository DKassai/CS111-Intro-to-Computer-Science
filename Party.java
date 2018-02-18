
public class Party {

	public static void main(String[] args) {

	System.out.println("How many people are coming to the party?");
	
		int A = IO.readInt();
				
	System.out.println("How many slices of pizza does each person eat?");
		
		int B = IO.readInt();
	
	System.out.println("How many cans of soda does each person want?");
	
		int C = IO.readInt();
		
	System.out.println("What is the cost of a pizza pie");
	
		double D = IO.readDouble();
		
	System.out.println("How many slices are there in a pie");
	
		int E = IO.readInt();
		
	System.out.println("What is the cost of a case of soda?");
	
		double F = IO.readDouble();
		
	System.out.println("How many cans are there in a case of soda?");
	
		int G = IO.readInt();
	
		// I used the Math.ceil so it would round up the number of pies because it wouldnt make
		//sense to have a part of a pie ordered 
		
		int H = (int) (Math.ceil((double)(A*B)/E)*D);
		
		int I = (int) (Math.ceil((double)(A*C)/G) *F);
		
		double J = I+H;
		
		IO.outputDoubleAnswer(J);
				
				
	
	
	
	
	
	
	
	
	}
}
	
