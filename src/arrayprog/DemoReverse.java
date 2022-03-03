package arrayprog;

public class DemoReverse {
 String rev="";
	public static void main(String[] args) {
		System.out.println("start");
		DemoReverse obj = new DemoReverse();
		String out = obj.reverse("meesaq");
		
		System.out.println(out);
		System.out.println("end");    
	}
	
	public  String reverse(String s) {
			
		for (int i = s.length()-1;i>=0; i--) {
			
			rev=rev +s.charAt(i);
			
		}
		
		
		return rev;
		
		
		
		
	}
}
