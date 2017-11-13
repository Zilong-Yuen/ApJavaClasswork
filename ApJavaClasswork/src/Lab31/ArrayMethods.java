package Lab31;

public class ArrayMethods {
	public static void main(String[] args)
	{
		int[] testT = {1,2,3,4,5,6,7,4,8,2,9,10,10};
		System.out.print(toString(removeDuplicates(testT)));
		System.out.println();
		System.out.println();
		
		int[] testMulti1 = {5,4,5};
		int[] testMulti2 = {2,3,2};
		int[][] product = productArray(testMulti1, testMulti2);
		for(int i = 0; i < testMulti1.length; i++)
		{
			for(int j = 0; j < testMulti2.length; j++)
			{
				System.out.print(" [ " + product[i][j] + " ] ");
			}
			System.out.println();
		}
		
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
					list[i] = list[0];
				}
			}
		}
		int[] noDupes = new int[list.length-dupes];
		noDupes[0] = list[0];
		int x = 1;
		int y = 1;
		while (x < noDupes.length)
		{
			if (list[y] != noDupes[0])
			{
				noDupes[x] = list[y];
				x++;
				y++;
			}
			else
			{
				y++;
			}
		}
		return noDupes;
	}
	
	public static int[][] productArray(int[] arr1,int[] arr2)
	{
		int[][] result = new int[arr1.length][arr2.length];
		for(int i = 0; i < arr1.length; i++)
		{
			int[] loop = new int[arr1.length];
			for(int j = 0; j < arr1.length; j++)
			{
				loop[j] = arr1[i]*arr2[j];
			}
			result[i] = loop;
		}
		return result;
	}
	
	public static int[][]  pascalTriangle(int n)
	{
		int[][] pascal = new int[n][]; 
		for (int i = 0; i < pascal.length; i++)
		{
			pascal[i] = new int [i + 1];
			for (int t = 0; t < pascal[i].length;t++)
			{
				if(t == 0 || t == pascal[i].length - 1)
				{
					pascal[i][t] = 1;
				}
				else
				{
					pascal[i][t] = pascal[i - 1][t - 1] + pascal[i -1][t];
				}
			}
		}
		return pascal;
	}
	
	public static void printPascalTriangle(int[][] triangle)
	{
		for(int i = 0; i < pascal.length[i]; i++)
		{
			for(int j = 0; j < pascal.length[j]; j++)
			{
				helo im tim
			}
		}
	}
	
	public static String toString(int[] list)
	{
		String temp = " ";
		for (int i = 0; i < list.length; i++)
		{
			temp += " [ " + list[i] + " ] ";
		}
		return temp;	
	}
	
}
