package arrayprog;

public class StringReverseWithVariable {

	public static void main(String[] args) {
		String s="meesaq";
		String s1=""; 
		
		
		for (int i =0;i<= s.length()-1; i++) {
			s1=s1+s.charAt(i);
			System.out.println(s1);
		}
		
		
	}
}
