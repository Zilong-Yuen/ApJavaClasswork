package Lab31;

public class ArrayMethods {
	public static int[] removeDuplicates(int[] list)
	{
		int[] noDupes = copyArray(list);
		for (int i = 0; i < list.length-1; i++)
		{
			for (int t = i+1; t < list.length; t++)
			{
				if (list[i] != list[t])
				{
					
				}
			}
		}
	}
	public static int[] copyArray(int[] intArray)
	{
		int[] copy = new int[intArray.length];
		
		for(int i =0;i < intArray.length;i++)
		{
			copy[i] = intArray[i];
		}
		return copy;	
	}
	
	
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		
	}
	
	public static int[][]  pascalTriangle(int n)
	{
		
	}
	
	public static void printPascalTriangle(int[][] triangle)
}
