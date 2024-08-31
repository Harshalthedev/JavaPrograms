public class leetArr36 {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1}, nums2 = {2,2,5,2,3,6};
        int[] arr = new int[2];
        int num1Count = 0;
        int num2Count = 0;
        for ( int i = 0; i < nums1.length; i++ ) {
            for ( int j = 0; j < nums2.length ; j++ ) {
                if ( nums1[i] == nums2[j]) {
                    num1Count++ ;
                    break;
                }
            }
        }
        for ( int i = 0; i < nums2.length; i++ ) {
            for ( int j = 0; j < nums1.length ; j++ ) {
                if ( nums2[i] == nums1[j]) {
                    num2Count++ ;
                    break;
                }
                
            }
        }
        arr[0] = num1Count ; 
        arr[1] = num2Count ; 
        System.out.println(arr[0]+ " "+ arr[1]);
    }
}
