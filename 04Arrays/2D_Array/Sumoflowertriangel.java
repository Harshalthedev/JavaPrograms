public class Sumoflowertriangel {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},           //0th index
            {4,5,6},          //1st index
            {7,8,9}         //2nd index
            // lowersum=1+4+5+7+8+9=34
        };
         int lowersum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                lowersum+=arr[i][j];
            }
        }
        System.out.println(lowersum);
    }
}
