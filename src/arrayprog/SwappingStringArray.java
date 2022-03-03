package arrayprog;



public class SwappingStringArray{
	
	
	
	public static void main(String[] args) {

		String s1 ="Welcome To tyss Bangalore";
	String s = s1.toLowerCase();
		String sarr[]=s.split(" ");
		
		for (int i = sarr.length-1;i>=0; i--) {
			
		System.out.print(sarr[i]+" ");
		}
		
		
		
	}

}
