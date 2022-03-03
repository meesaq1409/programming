package arrayprog;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class pract33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="meesaq is very meesaq is ";
//		Scanner sc= new Scanner(System.in);
//		String s1=sc.next();
		String []s2=s1.split(" ");
		System.out.println("dd");
		LinkedHashSet<String> l1=new LinkedHashSet<String>();
		
		for(String word:s2) {
			l1.add(word);
		}
		
		for(String word2:l1) {
			int count=0;
			for(String word3:s2) {
				if(word2.equals(word3)) {
					count++;
				}
				
			}
			System.out.println(word2+""+count);
		}
	}

}
