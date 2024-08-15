import java.util.Arrays;

public class leet19 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        int s = 0;
        int e =arr.length-1;
        Arrays.toString(rotate(arr,s,e));
        rotate(arr,3,e);
        System.out.println(Arrays.toString(rotate(arr,0,2)));
    }
    static int[] rotate(int[] arr,int s , int e) {
        while(s<=e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;

    }
}
