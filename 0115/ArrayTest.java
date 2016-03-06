public class ArrayTest {
    int[] numArray;
    String[] stringArray;

    public ArrayTest() {
        numArray = new int[10];
        for(int i = 0; i < numArray.length;i++) {
            numArray[i] = (int)(Math.random()*20+1);
        }
        stringArray = new String[5];
        stringArray[0] = "hello";
        stringArray[1] = "what";
        stringArray[2] = "yes";
        stringArray[3] = "no";
        stringArray[4] = "why";
        

    }
    public void printNumArray() {
        for(int each : numArray) {
            System.out.print(each+" ");
        }
    }
    public void printStringArray() {
        for(String each : stringArray) {
            System.out.print(each+" ");
        }

    }   
    public void swapNumArray(int num1,int num2) {
        int temp = numArray[num1];

        numArray[num1] = numArray[num2];
        numArray[num2] = temp;
    }
    public void swapStringArray(int num1,int num2) {
        String temp = stringArray[num1];

        stringArray[num1] = stringArray[num2];
        stringArray[num2] = temp;
    }
    public int searchString(String search) {
        for(int i = 0; i < stringArray.length;i++) {
            if(stringArray[i] == search)
                return i;

            
        }
        return -1;
    }
}

