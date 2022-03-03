package arrayprog;

import java.util.Iterator;

public class SumMin3Ele {
public static void main(String[] args) {
	
	
	int arr[]= {2,1,3,6,5,4};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	System.out.println(arr[i]);
	}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
	System.out.println("sum of min 3 ele = "+sum);
}
}
