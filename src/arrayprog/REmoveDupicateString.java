package arrayprog;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class REmoveDupicateString {
public static void main(String[] args) {
	
	
	String s="meesaq nabi khan";
	LinkedHashSet<Character> s1=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		s1.add(s.charAt(i));
	}
	for( Character ch:s1) {
		
	
		System.out.print(ch);
		}
	
//	System.out.println();
//	
//	String s2="meesaq nabi khan";
//	LinkedHashSet s3=new LinkedHashSet();
//	for (int i = 0; i < s2.length(); i++) {
//		s3.add(s2.charAt(i));
//	}
//	for(Object  ch:s3) {
//		
//	
//		System.out.print(ch);
//		}
}
}
