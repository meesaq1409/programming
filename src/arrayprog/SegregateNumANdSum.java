package arrayprog;

public class SegregateNumANdSum {
public static void main(String[] args) {
	String s ="1a2d3f";
	int n=0;
	int sum=0;
	
	for (int i = 0; i<s.length(); i++) {
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			n=s.charAt(i)-48;
			sum=sum+n;
		}
		
	}System.out.println(sum);
	
}}