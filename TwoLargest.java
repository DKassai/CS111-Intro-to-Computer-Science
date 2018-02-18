
public class TwoLargest {

	public static void main(String[] args) {
		
		System.out.println("what is the terminating value?");
		double end = IO.readDouble();
		double largest = 0;
		double secondLargest = 0;
		
		System.out.println("what are the values you would like to put in?");
		
		double input = IO.readDouble();
		if (input == end ) {
			IO.reportBadInput();
			input=IO.readDouble();
		} else{
			largest = input;
		}
		
		input= IO.readDouble();
		if (input==end) {
			IO.reportBadInput();
			input = IO.readDouble();
		}
		
		if (input <=largest ) {
			secondLargest = input;
	}else {
		secondLargest = largest;
		largest = input;
	}
		
		
		
		while (end != input) {
			
			input = IO.readDouble();
		
			if (input == end) {
				break;
			} else 
			
		if (input > secondLargest && input<largest) {
			input = secondLargest;
		} 
		else if (input> largest) {
			secondLargest=largest;
			largest=input;
		} 
		
		
		}
		
		IO.outputDoubleAnswer(largest);
		IO.outputDoubleAnswer(secondLargest);
	
	
	
	
	
	
	
	
	}

}
