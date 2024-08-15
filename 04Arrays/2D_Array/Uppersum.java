public class Uppersum {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},           //0th index
            {4,5,6},          //1st index
            {7,8,9}         //2nd index
            // uppersum=1+2+3+5+6+9=26
        };
int uppersum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >=i; j--) {
                uppersum+=arr[i][j];

            }
           
        }
        System.out.println(uppersum);
   
    }
}
