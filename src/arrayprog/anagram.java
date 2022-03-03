package arrayprog;

import java.util.Arrays;
import java.util.Iterator;

public class anagram {
	public static void main(String[] args) {
		
		
		String s1 ="race";
		String s2="care";
		if(s1.length()==s2.length())
		{
			
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
//			Arrays.sort(ch1);
//			Arrays.sort(ch2);
			
//			if(Arrays.equals(ch1, ch2)) {
//				System.out.println("anagram");
//			}
			String temp="";
			for (int i = 0; i < ch1.length; i++) {
				
				for (int j = 0; j < ch2.length; j++) {
					
				
				if(ch1[i]==ch2[j]) {
					
					temp=temp+ch1[i];
				}
			
				
			}
			}
			System.out.println(temp);
				if(temp==s1)
				{
					System.out.println("anagram");
				}
				
			
			
			
		}
	}

}
