package arrayprog;

public class Max3ele {
	public static void main(String[] args) {
		int [] arr= {2,1,4,3,7,5};
		int t=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=t;
		System.out.println("swaping of 1 and last element");
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		System.out.println("========================");
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}System.out.println(arr[i]);
		}	
		int sum=0;
		for (int i = 0; i < 3; i++) {
			
			sum=sum+arr[i];
		}System.out.println("sum of max 3 ele = "+sum);
}
}
