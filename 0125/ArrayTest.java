public class ArrayTest
{
	public void printArray(int[] nums) {
		for(int each : nums) {
			System.out.print(each+" ");
		}
		System.out.println();
	}
	public void scramble(int[] nums) {
		for(int i = 0; i < nums.length;i++) {
			int temp = nums[i];
			int j = (int)(Math.random()*nums.length);
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
	public void sortBubble(int[] nums) {
		for(int i = 0; i < nums.length-1;i++) {
			for(int j = i+1; j < nums.length;j++) {
				if(nums[j] < nums[i]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	public void sortString(String[] words) {
		for(int i = 0; i < words.length-1;i++) {
			int currentIndex = i;
			int minIndex = i;
			for(int j = i+1; j < words.length;j++) {
				if(words[minIndex].compareTo(words[j]) > 0) {
					minIndex = j;
				}
			}
        
            if(!words[minIndex].equals(currentIndex)) {
                String temp = words[minIndex];
                words[minIndex] = words[currentIndex];
                words[currentIndex] = temp;
            }
	    }
    }
   /* public void sortSelection(int[] num) {
        for (int i=0; i < num.length-1; i++)
        {
            //Assume the current index at the start is
            //the lowest.
            int currentIndex = i;
            int minIndex = i;
            
            //Find index containing the lowest number.
            for (int j=i+1; j < num.length; j++)
            {
                if (num[j] <  num[minIndex])
                {
                    minIndex = j;
                }
            }
            
            //Swap with the index containing the 
            //lowest number with the current index 
            //if found
            if( minIndex != currentIndex )
            {
                int temp = num[currentIndex];
                num[currentIndex] = num[minIndex];
                num[minIndex] = temp;
            }
        }
    }*/
        
	public void sortSelection(int [] nums) {

		for(int i = 0; i < nums.length-1 ; i++) {
			int minIndex = i;
			int currentIndex = i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex])
                    minIndex = j;
            }
            if(minIndex != currentIndex)
            {
                int temp = nums[minIndex];
                nums[minIndex] = nums[currentIndex];
                nums[currentIndex] = temp;
            }
        }
	}
}


