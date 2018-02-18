# cs111

public class StringRec {

	public static void main(String[] args) {
		
		System.out.println(decompress("4q9w5e2rt5y4qw2Er3T"));
	}

	public static String decompress(String compressedText) {
		if (compressedText.length()==0 || compressedText.length()==1) {
			return compressedText;
		}
		else {
			if (Character.isLetter(compressedText.charAt(0))) {
				return compressedText.charAt(0) + decompress(compressedText.substring(1));
			}else {
				if (compressedText.charAt(0)=='0') {
					return decompress(compressedText.substring(2));
				}else {
					char c = compressedText.charAt(0);
					char x = compressedText.charAt(1);
					int value = c-'0';
					compressedText= Integer.toString(value-1) + x + compressedText.substring(2);
					return x + decompress(compressedText);
				}
			}
		}
	}
}
