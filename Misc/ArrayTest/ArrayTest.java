import java.util.Arrays;
import java.util.Collections;

public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] nums = new int[10];
		for(int i = 0; i < nums.length;i++)
		{
			nums[i] = (int)(Math.random()*100);
		}
		for(int each : nums)
		{
			System.out.print(each+" ");
		}
		Arrays.sort(nums);
		System.out.println();
		for(int each : nums)
		{
			System.out.print(each+" ");
		}
		
	}	
}