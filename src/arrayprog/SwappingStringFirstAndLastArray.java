package arrayprog;

public class SwappingStringFirstAndLastArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Welcome to india";
		String s1[]=s.split(" ");
		String temp="";
		temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		
		for (int i = 0; i < s1.length; i++) {
			
			System.out.print(s1[i]+" ");
		}
		
		}

}
