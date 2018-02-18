
public class WordCount {

	public static void main(String[] args) {
		System.out.println("what is the String you want to input?");
		String original = IO.readString();
		System.out.println("what is the max length of the word you want?");
		int maxlength = IO.readInt();
		System.out.println(countWords(original, maxlength));
		}

	public static int countWords(String original, int maxLength) {
		original += " ";
		int lettercount=0;
		int totalcount=0;
		
		for (int i = 0; i<original.length(); i++) {
			
			
			if (Character.isLetter(original.charAt(i)) == true) {
				lettercount++;
			}else if (original.charAt(i) == ' ') {
				if (lettercount!=0 && lettercount<=maxLength) {
					totalcount++;
				}
				lettercount = 0;
			}
		}
		
		return totalcount;
	}
	
}
