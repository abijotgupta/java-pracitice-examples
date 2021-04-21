// Java program for implementation of Selection Sort
class SelectionSort
{
	public void sort(int arr[])
	{
		int n=arr.length;

		//one by one move boundary of unsorted sub array
		for(int i=0; i<n-1; i++)                     //if a array contains n elements then we have to sort only n-1 elements bcoz last element is automatically sorted
		{
			//find the index of minimum element
			int min_idx=i;
			for(int j=i+1; j<n; j++)                  //here j=i+1 bcoz i is our first element so 1st element compares with 2nd element
			{
				if(arr[j] < arr[min_idx])
					min_idx=j;
			}
				//swap the minimum element found with the first element
				int temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
		}
	}

	public void sortedArr(int arr[])
	{
		int n=arr.length;

		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] +"  ");
		}
	}

	public static void main(String[] args)
	{
		SelectionSort ob=new SelectionSort();

		int arr[]={64,34,25,12,22,11,90};
		ob.sort(arr);

		System.out.println("Sorted array is  : ");
		ob.sortedArr(arr);
	}
}