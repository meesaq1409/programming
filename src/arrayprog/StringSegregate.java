package arrayprog;

public class StringSegregate {
	public static void main(String[] args) {
		String s1="asbf&1234*";
		String al="";
		String spl="";
		String num="";
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z'||s1.charAt(i)>='A'&&s1.charAt(i)<='Z') {
				
				  al= al+s1.charAt(i);
				
			}
			else if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				
				num=num+s1.charAt(i);
			}
			else
			{
				
				spl=spl+s1.charAt(i);
			}
		}System.out.println("alphabet="+al+" "+"numbers="+num+" "+"special char"+spl);
	}

}
