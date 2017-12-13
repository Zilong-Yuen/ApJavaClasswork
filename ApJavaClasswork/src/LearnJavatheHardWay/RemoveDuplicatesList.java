package LearnJavatheHardWay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesList {
	public static ArrayList(integer) removeDupes(ArrayList<Integer>nums)
	{
		Collections.sort(nums);
		for(int i = 0; i < nums.size(); i++)
		{
			for(int j = 0; j < nums.size(); j++)
			{
				if(nums.get(i) == nums.get(j))
				{
					nums.remove(i);
				}
			}
		}
		return nums;
	}
}
