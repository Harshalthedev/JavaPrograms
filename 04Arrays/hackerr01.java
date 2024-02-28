public class hackerr01 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,-1,-1};
    double sum1 =0.0;
    double sum2 =0.0;
    double sum3 =0.0;
    for(int i=0;i<arr.length;i++) {
        if(arr[i] > 0) {
           sum1++; 
        }
        else if(arr[i] < 0) {
            sum2++;
        }
        else {
            sum3++;
        }
    }
        double temp1 = sum1/((arr.length)+0.0);
        double temp2 = sum2/((arr.length)+0.0);
        double temp3 = sum3/((arr.length)+0.0);
        System.out.printf("%.6f\n",temp1);
        System.out.printf("%.6f\n",temp2);
        System.out.printf("%.6f\n",temp3);
    }
}
