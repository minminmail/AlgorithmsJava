package algorithms;

public class SelectSort {
	
	public static void main(String args[])
	{
		int A[]= {2,7,4,1,5,3};
		SelectSortAlgorithm(A);
		
		for(int i=0;i<A.length;i++)
		{
		  System.out.print(A[i] + " ");
		
		}
		
	}
	
	public static void SelectSortAlgorithm(int arr[]) {
		
		int n=arr.length;
		
		for (int i=0;i<n-1;i++)
		{
			
			int minIndex = i;
			
			for (int j=i+1;j<n;j++)
			{
				if (arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
				
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
						
		}		
	}
}
