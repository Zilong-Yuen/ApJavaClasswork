package Lab31;

public class ArrayMethods {
	public static void main(String[] args)
	{
		int[] TimZilong = {1,2,3,4,5,6,7,4,8};
		System.out.print(toString(removeDuplicates(TimZilong)));
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		int dupes = 0;
		for (int i = 0; i < list.length-1; i++)
		{
			for (int t = i+1; t < list.length; t++)
			{
				if (list[i] == list[t])
				{
					dupes++;
				}
			}
		}
		int[] noDupes = new int[list.length-dupes];
		for (int i = 0; i < list.length-1; i++)
		{
			for (int t = i+1; t < list.length; t++)
			{
				if (list[i] != list[t])
				{
					noDupes[t] = list[i];
				}
			}
		}
		return noDupes;
	}
	/*
	 * public static int[] copyArray(int[] intArray)
	{
		int[] copy = new int[intArray.length];
		
		for(int i =0;i < intArray.length;i++)
		{
			copy[i] = intArray[i];
		}
		return copy;	
	}
	*/
	
	
	//public static int[][] productArray(int[] arr1, int[] arr2)
	{
		
	}
	
	//public static int[][]  pascalTriangle(int n)
	{
		
	}
	
	//public static void printPascalTriangle(int[][] triangle)
	{
		
	}
	
	public static String toString(int[] list)
	{
		String temp = "";
		for (int i = 0; i < list.length; i++)
		{
			temp += list[i] + ", ";
		}
		return temp;
			
	}
}
