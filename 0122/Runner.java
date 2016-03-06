public class Runner {
    public static void main(String[] args) {
        ArrayTest a = new ArrayTest();
        int[] nums = new int[10];
        for(int i = 0; i < nums.length;i++) {
            nums[i] = (int)(Math.random()*9+1);
        }
        a.printArray(nums);
        a.scramble(nums);
        a.printArray(nums);
        int i = 20;
        a.change(i);
        System.out.println(i);
        
        String[] words = {"dog","cat","thing","cosa","bird"};
    }
}
