package arrayprog;

public class ConCatinatingTwoString {

	public static void main(String[] args) {
		String s="abc"+"xyz";
		System.out.println(s);
		//s="abcxyz";
		
		
		for (int i = 0; i < s.length()/2; i++) {
			System.out.print(s.charAt(i)+""+s.charAt(s.length()/2+i));
		}
	}
}
