package arrayprog;

import java.util.LinkedHashSet;

public class CountOfOccurance {
	public static void main(String[] args) {
		
		
		String s1="hello world hello meesaq";
		
		String[] sarr=s1.split(" ");
		System.out.println("number of eleemnt"+sarr.length);
		
		System.out.println();
		
		
		
		LinkedHashSet<String> l1 =new LinkedHashSet<String>();
		//System.out.println(sarr[2]);
		for(String word:sarr)
		{
			l1.add(word);
			
		}
		System.out.println(l1);
		for(String word2:l1) {
			int count=0;
			for(String word3:sarr)
			{if(word2.equals(word3))
			{
				count++;
				
			}
			}System.out.println(word2+" "+count);
		}
		
	}

}
