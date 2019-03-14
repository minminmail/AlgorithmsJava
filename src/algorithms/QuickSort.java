package algorithms;

/*n the best case, the algorithm will divide the list into two equal size sub-lists. So, the first iteration of the full n-sized list needs O(n). Sorting the remaining two sub-lists with n/2 elements takes 2*O(n/2) each. As a result, the QuickSort algorithm has the complexity of O(n log n).

In the worst case, the algorithm will select only one element in each iteration, so O(n) + O(n-1) + … + O(1), which is equal to O(n2).

On the average QuickSort has O(n log n) complexity, making it suitable for big data volumes.

*/
public class QuickSort {
	
	public static void main(String args[])
	{
		int arr[]= {7,2,1,6,8,5,3,4};
		QuickSortAlgorithm(arr,0,7);
		for( int i=0;i<8;i++)
			System.out.print(arr[i]);
					
	}
	
	public static void QuickSortAlgorithm(int arr[], int start, int end)
	{
		if(start<end) {
			int partitionIndex=Patition(arr,start,end);
			QuickSortAlgorithm(arr,start,partitionIndex-1);
			QuickSortAlgorithm(arr,partitionIndex+1,end);
		}

	}
	
	public static int Patition(int arr[],int start,int end){
		int pivot=arr[end];
		System.out.print(" pivot :" + pivot);
		System.out.print("\n");
		int patitionIndex = start;
		for(int i= start;i<end;i++) {
			if(arr[i]<=pivot)
			{
				System.out.print(" before arr[i] :" + arr[i] + ", arr[patitionIndex]:"+arr[patitionIndex]);
				swap(arr,i,patitionIndex);
				System.out.print("\n");
				System.out.print(" after arr[i] :" + arr[i]+ ", arr[patitionIndex]:"+arr[patitionIndex]);
				patitionIndex++;	
				System.out.print("\n\n");
			}
		}
		
		swap(arr,patitionIndex,end);
		return patitionIndex;	
	}
	
	public static void swap(int arr[],int i, int j)
	{
		int temp=arr[j];
		arr[j] = arr[i];
		arr[i] = temp;		
	}

}
