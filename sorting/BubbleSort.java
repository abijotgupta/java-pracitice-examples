// Java program for implementation of Bubble Sort
class BubbleSort
{
	void bubble_sort(int arr[])
	{
		int n=arr.length;

		for(int i=0; i<n; i++)           //if a array contains n elements then we have to sort only n-1 elements bcoz last element is automatically sorted
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		BubbleSort ob=new BubbleSort();

		int arr[]={64,34,25,12,22,11,90};
		ob.bubble_sort(arr);

		System.out.println("Sorted array is  : ");
		ob.sortedArr(arr);
	}
}