package Lab34;

public class ArrayMethods4 {
	public static void main(String[] args)
	{
		int[] test1 = {5,2,6,7,2,9,3,5,1};
		print(partition(test1,0,test1.length));
	}
	public static int[] partition (int[] list1, int front, int back)
	{
		int pivot = list1[(front+back)/2];
		int low = front;
		int high = back;
		while (low <= high)
		{
			while(list1[low] < pivot)
			{
				low++;
			}
			while(list1[high] > pivot)
			{
				high--;
			}
			if (low <= high)
			{
				swap(list1, low++, high--);
			}
		}
		return list1;
	}
	public static void swap(int[] list1, int one, int two)
	{
		int temp = list1[one];
		list1[one] = list1[two];
		list1[two] = temp;
	}
	/*public static int quickSort(int[] list1, int front, int back)
	{
		
	}*/
	public static void print(int[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			System.out.print("[" + list[i] + "]");
		}
	}
}
