
public class SmallestLargest {

	public static void main(String[] args) {
		IO.outputStringAnswer("Input the starting/ending number");
		double starterEnder = IO.readDouble();
		IO.outputStringAnswer("Input other numbers");
		double number = IO.readDouble();
		double Biggest = number;
		double smallest = number;
		while (number!= starterEnder) {
			number= IO.readDouble();
		if (starterEnder==number) {
			break;
			}
		
		
	
	Biggest= Math.max(Biggest,number);
	smallest=Math.min(smallest,number);
		}
	
	IO.outputDoubleAnswer(smallest);
	IO.outputDoubleAnswer(Biggest);
	}
}

	


