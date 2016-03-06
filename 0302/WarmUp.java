public class WarmUp {
    private int[][] numMatrix;
    public WarmUp() {
        numMatrix = new int[4][5];
        for(int i = 0;i < numMatrix.length;i++) {
            for(int j = 0; j < numMatrix[i].length;j++) {
                numMatrix[i][j] = (int)(Math.random()*50+1);
            }
        }
    }
    public void print() {
        for(int i = 0;i < numMatrix.length;i++) {
            for(int j = 0; j < numMatrix[i].length;j++) {
                System.out.print(numMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int findLargest() {
        int largest = numMatrix[0][0];
        for(int i = 0;i < numMatrix.length;i++) {
            for(int j = 0; j < numMatrix[i].length;j++) {
                if(numMatrix[i][j] > largest) {
                    largest = numMatrix[i][j];
                }
            }
        }
        return largest;
    }
}
