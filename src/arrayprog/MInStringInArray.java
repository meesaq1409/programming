package arrayprog;

public class MInStringInArray {
public static void main(String[] args) {
	String[] str= {"apple","mango","sdsf","mee","meesaq","saq"};
	
	String min=str[0];
	
	for (int i = 0; i < str.length; i++) {
		if(min.length()>str[i].length())
		{
			min=str[i];
		}}
	for (int j = 0; j < str.length; j++) {
		
	
		if(min.length()==str[j].length())
		{
			min=str[j];
			System.out.println(str[j]);
		}
		
	}
}
}
