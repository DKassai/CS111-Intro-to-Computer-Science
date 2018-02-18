
public class LuckySevens {
	public static void main(String[] args) {
	
		IO.outputStringAnswer("What is the lower end of the numbers?");
		int lowerEnd= IO.readInt();
		IO.outputStringAnswer("What is the higher end of the numbers?");
		int upperEnd= IO.readInt();
		LuckySevens.countLuckySevens(lowerEnd, upperEnd);
	}
	
	public static  int countLuckySevens(int lowerEnd, int upperEnd) {
		int count = 0;
		
		if (upperEnd<lowerEnd) {
			IO.reportBadInput();
		}
		
		for (int i=lowerEnd; i<=upperEnd; i++) {
			
			String temp =String.valueOf(i);
			
			for (int j=0; j < temp.length(); j++) {
			
				if(temp.charAt(j) == '7') {
				
					count++;
				}
			}
	
		}
		return count;
		
		
			
		
		
		
	
		
		
		
	}

}
