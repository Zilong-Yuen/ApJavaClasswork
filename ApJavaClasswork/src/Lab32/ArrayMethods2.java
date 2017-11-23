package Lab32;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethods2 {
	public static void main(String []args)
	{
		String[] test1 = {"a","b","c","d","t"};
		String[] test2 = {"w","x","y","z"};
		String[] merged = merge(test1, test2);
		for (int i = 0; i < test1.length + test2.length; i++)
		{
			System.out.print("[" + merged[i] + "]");
		}
		System.out.println(" ");
		String[] test3 = {"orange", "tim", "apple", "coconut", "pineapple", "banana", "maple"};
		String[] mergeSortTest = mergeSort(test3);
		for (int i = 0; i < mergeSortTest.length; i++)
		{
			System.out.print("[" + mergeSortTest[i] + "]");
		}
		System.out.println(" ");
		int[] test4 = {8,5,3,7,8,2,3,9,9,5};
		System.out.print(partition(test4));
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] merged = new String[list1.length + list2.length];
		int z = 0;
		int firstList = 0;
		int secList = 0;
		while(firstList < list1.length && secList < list2.length)
		{
			if (list1[firstList].compareTo(list2[secList]) == 0)
			{
				merged[z] = list1[firstList];
				firstList++;
				secList++;
				z++;
			}
			else if (list1[firstList].compareTo(list2[secList]) < 0)
			{
				merged[z] = list1[firstList];
				firstList++;
				z++;
			}
			else if (list2[secList].compareTo(list1[firstList]) < 0)
			{
				merged[z] = list2[secList];
				secList++;
				z++; 
			}
		}
		
		if (firstList >= list1.length)
		{
			while (secList < list2.length)
			{
				merged[z] = list2[secList];
				z++;
				secList++;
			}
		}
		if(secList >= list2.length)
		{
			while (firstList < list1.length)
			{
				merged[z] = list1[firstList];
				z++;
				firstList++;
			}
		}
		return merged;
	}
	
	public static String[] mergeSort(String[] list)
	{
		if (list.length == 1)
		{
			return list;
		}
		else
		{
			int half = list.length/2;
			String[] firstHalf = Arrays.copyOfRange(list, 0, half);
			String[] secondHalf = Arrays.copyOfRange(list, half, list.length);
			return merge(mergeSort(firstHalf), mergeSort(secondHalf));
		}
	}
	
	public static int partition(int[] list)
	{
		int pivot = list[0];
		int counter = 0;
		for(int i = 1; i < list.length; i++)
		{
			if(list[i] <= pivot)
			{
				counter++;
			}
		}
		return counter;
	}
}
