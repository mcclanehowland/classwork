import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 10;i++) {
            nums.add((int)(Math.random()*10+1));
        }
        ArrayTest a = new ArrayTest();
        a.print(nums);
        a.scramble(nums);
        System.out.println();
        a.print(nums);
    }
}
