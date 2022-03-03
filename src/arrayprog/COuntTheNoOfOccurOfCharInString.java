package arrayprog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class COuntTheNoOfOccurOfCharInString {
	
public static void main(String[] args) {
	
	String s1="meesaqA";
	String s=s1.toLowerCase();
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for(Character ch:set)
	{
		int count=0;
			
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i)) {
			
								count++;
			}
			
		}
		System.out.println(ch+":"+count);
	}
	
	
}
}
