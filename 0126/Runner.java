public class Runner {
    public static void main(String[] args) {
        ArrayTest a = new ArrayTest();
        int[] nums = {6,5,4,3,2,1};
        a.printArray(nums);
        a.sort(nums);
        a.printArray(nums);
    }
}
