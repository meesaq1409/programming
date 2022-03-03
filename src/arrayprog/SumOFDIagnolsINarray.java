package arrayprog;

public class SumOFDIagnolsINarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			int b[]=a[i];
			if(i==0)
			count=b.length-1;
		
			
			for (int j=0;j < b.length;j++) {//b=123
				
				if(j==count) {
				 sum=sum+b[j];
					count--;
					break;
					
				}
			}
			
		}System.out.println(sum);
	}

}
