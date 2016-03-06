public class ArrayTest {

    String[] words;

    public ArrayTest() {
        words = new String[5];
        words[0] = "cat";
        words[1] = "thing";
        words[2] = "cosa";
        words[3] = "other";
        words[4] = "zed";
    }
    public void print() {
        for(String each : words) {
            System.out.print(each+" ");
        }
        System.out.println();
    }
    public void sort() {
        for(int i  = 0 ; i < words.length-1;i++) {
            int currentIndex = i;
            int minIndex = i;
            for(int j = i+1; j < words.length;j++) {
                if(words[minIndex].compareTo(words[j]) > 0) {
                    minIndex = j;
                }
            }
            if(minIndex != currentIndex) { 
                String temp = words[currentIndex];
                words[currentIndex] = words[minIndex];
                words[minIndex] = temp;
            }
        }
    }
}

