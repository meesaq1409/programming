package arrayprog;

public class ArraySort {
public static void main(String[] args) {
	
	int arr1[]= {1,0,2,0,0,4,0}  ;//o/p={1,2,4,0,0,0,0}
	
	int arr2[]=new int[arr1.length];
	
	int m=arr1.length-1;
	int n=0;
	
	
	for (int i = 0; i < arr1.length; i++) {
		
		if(arr1[i]==0)
		{
			arr2[m]=arr1[i];
			m--;
		}
		else
		{	arr2[n]=arr1[i];
		n++;
	}
	}
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]);
	}
}
}
