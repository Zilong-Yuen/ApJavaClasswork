package Lab33;

public class ArrayMethods3 {
	public static void main(String[] args)
	{
		System.out.print("Selection Sort:\n");
		double[] test1 = {5,3,1,7,2,9,10,2,6,7};
		selectionSort(test1);
		for (int i = 0; i < test1.length; i++)
		{
			System.out.print("[" + test1[i] + "]");
		}
		
		System.out.println("\nInsertion Sort: ");
		int[] test2 = {5,3,1,7,2,9,10,2,6,7};
		insertionSort(test2);
		for (int i = 0; i < test2.length; i++)
		{
			System.out.print("[" + test2[i] + "]");
		}
		
		System.out.println("\nBubble Sort:");
		String[] test3 = {"a","b","d","t","c","z","b","q"};
		bubbleSort(test3);
		for (int i = 0; i < test3.length; i++)
		{
			System.out.print("[" + test3[i] + "]");
		}
	}
	public static void insertionSort(int[] list1)
	{
		int z = 0;
		for (int i = 0; i <= list1.length; i++)
		{
			for (int j = z - 1; j >= 0; j--)
			{
				if (list1[j] >= list1[z])
				{
					swap(list1,j,z);
					z--;
				}
			}
			z = i;
		}
	}
	public static void selectionSort(double[] list1)
	{
		for (int i = 0; i < list1.length-1; i++)
		{
			for (int j = i+1; j < list1.length; j++)
			{
				if (list1[i] > list1[j])
				{
					swap(list1,i,j);
				}
			}
		}
	}
	public static void bubbleSort(String[] list1)
	{
		for (int i = 0; i < list1.length; i++)
		{
			for (int j = i+1; j < list1.length; j++)
			{
				if (list1[i].compareTo(list1[j]) < 0)
				{
					String temp = list1[i];
					list1[i] = list1[j];
					list1[j] = temp;
				}
				if (list1[j].compareTo(list1[i]) < 0)
				{
					String temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
				}
			}
		}
	}
	
	public static void swap(double[] arr, int a, int b)
	{
		double temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
