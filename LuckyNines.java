public class LuckyNines {

	public static void main(String[] args) {
		IO.outputStringAnswer("What is the lower end of the numbers?");
		int lowerEnd= IO.readInt();
		IO.outputStringAnswer("What is the higher end of the numbers?");
		int upperEnd= IO.readInt();
		LuckyNines.countLuckyNines(lowerEnd, upperEnd);
		
	}
	
	
	public static int countLuckyNines( int lowerEnd, int upperEnd) {
		int count = 0;
		
		if (upperEnd<lowerEnd) {
			return -1;
		}
		for (int i=lowerEnd; i<=upperEnd; i++) {
			
			String temp =String.valueOf(i);
			
			for (int j=0; j < temp.length(); j++) {
			
				if(temp.charAt(j) == '9') {
				
					count++;
				}
			}
	
		}
		IO.outputIntAnswer(count);
		
		return count;
		
		
		
		
		
		
		



	
	}
}
