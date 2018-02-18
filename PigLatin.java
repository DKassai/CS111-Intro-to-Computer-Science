
public class PigLatin {

	public static void main(String[] args) {
	System.out.println("what is the word you want to input?");
	String Original= IO.readString();
		System.out.println(PigLatin.translate(Original));
	
	}
	
	public static String translate (String Original) {
		
		Original.toLowerCase();
		
		
		if (Original.charAt(0)=='a' || Original.charAt(0)=='e' || Original.charAt(0)=='i' || 
				Original.charAt(0)=='o'|| Original.charAt(0)=='u') {
			return Original+"vai";
			
		}
		else if (Original.charAt(0)!='a' || Original.charAt(0)!='e' || Original.charAt(0)!='i' || 
				Original.charAt(0)!='o'|| Original.charAt(0)!='u') {
			
			return Original.substring(1,Original.length()) + Original.charAt(0) + "ai";
		}
		return null;
	}

}
