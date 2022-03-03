package arrayprog;

public class MaximumStringInArray {

	public static void main(String[] args) {
		
		String str[]= {"a","df","sdd","dfdf","hghry","asdfg"};
		
		String maxlength=str[0];
		for (int i = 1; i < str.length; i++) {
			
			if(maxlength.length()<str[i].length())
			{
				maxlength=str[i];
			}
		}//System.out.println(maxlength);
		
		for (int i = 0; i < str.length; i++) {
			
			if(maxlength.length()==str[i].length())
			{
				maxlength=str[i];
				System.out.println(str[i]);
			}
		}
		
		
	}
}
