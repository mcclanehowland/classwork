

public class ArrayTest {

    public void printArray(int[] nums) {
        for(int each : nums) {
            System.out.print(each+" ");
        }
        System.out.println();
    }
    public void sort(int[] nums) {
        for(int i = 0; i < nums.length-1;i++) {
            int minIndex = i;
            int currentIndex = i;
            for(int j = i+1;j< nums.length;j++) {
                if(nums[j] < nums[currentIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != currentIndex) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[currentIndex];
                nums[currentIndex] = temp;
            }
        }
    }
}

   
