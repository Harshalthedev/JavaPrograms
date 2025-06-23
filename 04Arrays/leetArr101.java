public class leetArr101 {
    public static void main(String[] args) {
        int[][] res = flipAndInvertImage(new int[][] {{1,1,0},
                                                     {1,0,1},
                                                    {0,0,0}});
        for (int[] is : res) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }                                            
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int j = 0; 
            int k = image.length-1;
            while (j <= k) {
                int temp1 = image[i][j];
                int temp2 = image[i][k];
                if (temp1 == 0) temp1 = 1;
                else if(temp1 == 1) temp1 = 0;
                if (temp2 == 0) temp2 = 1;
                else if(temp2 == 1) temp2 = 0;
                image[i][j] = temp2;
                image[i][k] = temp1;
                j++;
                k--;
            }
        }
        return image;
    }
}
