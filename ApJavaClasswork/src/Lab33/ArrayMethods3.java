package Lab33;

public class ArrayMethods3 {
	public static void main(String[] args)
	{
		String[] test1 = {"a","b","d","t","c","z","b","q"};
		bubbleSort(test1);
		for (int i = 0; i < test1.length; i++)
		{
			System.out.print("[" + test1[i] + "]");
		}
		System.out.println(" ");
		double[] test2 = {5,3,1,7,2,9,10,2,6,7};
		selectionSort(test2);
		for (int i = 0; i < test2.length; i++)
		{
			System.out.print("[" + test2[i] + "]");
		}
	}
	public static void insertionSort(int[] list1)
	{
		
	}
	public static void selectionSort(double[] list1)
	{
		for (int i = 0; i < list1.length-1; i++)
		{
			for (int j = i+1; j < list1.length; j++)
			{
				double compare = list1[i+1];
				if (list1[i] > compare)
				{
					/*double temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
					*/
					
					
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
}
