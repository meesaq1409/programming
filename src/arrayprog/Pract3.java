
package arrayprog;

import java.util.Iterator;

public class Pract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="12a@#34c#%d56";
		
		int res=0;
		
		for (int i = 0; i < s.length(); i++) {
			int num1=0;
			 if(s.charAt(i)>='0'&&s.charAt(i)<='9'&&(i==s.length()-1||s.charAt(i+1)<='0'||s.charAt(i+1)>='9'))
			{
				num1=s.charAt(i)-48;
				//System.out.println(num1);
			}
			 else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				num1=s.charAt(i)-48;
				num1=num1*10;
				//System.out.print(num1);
				
			}
			
			
			res=res+num1;
			
		
		}
		System.out.println("result is ="+res);
	
// 2nd  way	of programming 
		
		
		
		
		int sum=0;
		int tsum=0;
		String s1="12ad34rt67";
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				int n=s1.charAt(i)-48;
				sum=sum*10+n;	
				
			}
			else
			{
				tsum=tsum+sum;
				sum=0;
			}
		}System.out.println(tsum+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
