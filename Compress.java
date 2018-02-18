
public class Compress {

	public static void main(String[] args) {
		System.out.println("what is the string you would like to compress ?");
		String original = IO.readString();
		System.out.println(compress(original));
		}

	public static String compress (String original) {
		original = original + ' ';
		
		boolean start= true;
		String x = " ";
		char y = ' ';
		
		for (int i=0; i<original.length(); i++) {
			if (start==true) {
				y=original.charAt(i);
				start=false;
			}else {
				if (original.charAt(i)==y) {	
				}else {
					x= x + count(original.substring(0, i));
					original = original.substring(i);
					y=original.charAt(0);
					i=0;
				}
			}
		}
	
	return x.substring(1, x.length());
	}
	
	public static String count (String original) {
		int total = 0;
		char x = ' ';
		x = original.charAt(0);
		total= original.length();
		if (total==1) {
			return Character.toString(x);
		}else {
			return Integer.toString(total) + Character.toString(x);
		}
	}
}
