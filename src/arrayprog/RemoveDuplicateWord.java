package arrayprog;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String s="hello welcome hello world welcome to ty";
		String [] sarr=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(String word: sarr)
		{
			set.add(word);
		}
		System.out.println(set);
		for(String word1:set)
		{
			System.out.println(word1);
		}
	}
}
