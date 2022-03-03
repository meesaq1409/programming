package arrayprog;

public class FibonacciSeries {
	public static void main(String[] args) {
			
		String s[]= {"a","try","aaaaa","hello+"};
		//first for  loop to iterate the array
		for (int i = 0; i < s.length; i++) {
			int a=0;
			int b=1;
			int n=s[i].length();  //first element a s length
			
			 //this for loop to iterate String
			for(int j=1;j<=n;j++) {
				// a   try  aaaaa  hello+
				int c=a+b;
				if(c==n) {
					System.out.println(s[i]+"= yes");
					
					break;
				}
				else if(j==n) {
					System.out.println(s[i]+"= no");
				}
					else
					{
						a=b;
						b=c;
					}				
			}
		}
	}

}
