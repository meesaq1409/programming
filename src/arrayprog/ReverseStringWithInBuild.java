package arrayprog;

public class ReverseStringWithInBuild {

	public static void main(String[] args) {
		
	
	String s="my name is meesaq";
	String s1="";
int length = s.compareTo(s1);
System.out.println(length);
for (int i = s.length()-1; i>=0;i--) {
	s1=s1+s.charAt(i); 
}
	System.out.println(s1);
}
}