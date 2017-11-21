package Lab32;

public class ArrayMethods2 {
	public static void main(String []args)
	{
		String[] test1 = {"a","b","c","d","z"};
		String[] test2 = {"w","x","y"};
		String[] merged = merge(test1, test2);
		for (int i = 0; i < test1.length + test2.length; i++)
		{
			System.out.print("[" + merged[i] + "]");
		}
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
		return merged;
	}
	
	//public static String[] mergeSort(String[] list)
	{
		
	}
	
	//public static int partition(int[] list)
	{
		
	}
}
