package arrayprog;

public class ReverseAlphaOFString {
public static void main(String[] args) {
	
	String s="welcome to tyss";
	String sarr[]=s.split(" ");
	
	for (int i = 0; i < sarr.length; i++) {
		String s1=sarr[i];
		for (int j = s1.length()-1;j>=0; j--) {
			System.out.print(s1.charAt(j));
		}
		System.out.print(" ");
	}
	
}
}
