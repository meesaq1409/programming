package arrayprog;

public class AscendSorted {
	public static void main(String[] args) {
		int [] arr= {2,1,4,3,7,5};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}System.out.println(arr[i]);
			
		}
		
		
		
	}

}
