public class ArrayTest {
    public void printArray(int[] nums) {
        for(int each : nums) {
             System.out.print(each+" ");
        }
        System.out.println();
    }
    public void printArray(String[] words) {
         for(String each : words) {
             System.out.print(each+" "); 
            }
          System.out.println();
    }
    public void scramble(int[] nums) {
         for(int i = 0 ; i < nums.length;i++) {
             int j = (int)(Math.random()*nums.length-1);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }
    }
    public void change(int a) {
        a = 10;
    }

    public void scramble(String[] words) {
        for(int i = 0; i < words.length;i++) {
            int j = (int)(Math.random()*words.length-1);
            String temp = words[i];
            words[i] = words[j];
             words[j] = temp;
        }

    }
}

