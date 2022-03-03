package arrayprog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Pract2 {

	public static void main(String[] args) {
		
		String s ="meesaq is very meesaq is very nice";
		String arr[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		
		}
		for(String str:set)
		{
			
			int count=0;
			for (int i = 0; i < arr.length; i++) {
		
				if (str.equals(arr[i])) {
					count++;
			
				}
			}System.out.println(str+":"+count);
		}
		
	}
}
