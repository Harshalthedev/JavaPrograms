class leet05 {
    public static void main(String[] args){
        int[] arr = {1,3,6,8,9,11,15,17,19,20,22,25,27,29,30,32,35,36,39,40,44,45,48,49,50,51,54,58,59,63,
            65,69,70,71,75,79};
            int target = 63;
            System.out.println(ans(arr,target));
    }
    static int ans(int [] arr,int target) {
        int s=0;
        int e=1;
        while (target > arr[e]) {
            int temp =e+1;
            e = e +(e-s+1)*2; 
            s = temp;   
        }
        return binarysearch(arr, target, s, e);
        }
        static int binarysearch(int[] arr,int target,int s,int e)
        {
            while (s<=e) {
                int mid = s+(e-s)/2;
                if(target == arr[mid]) {
                    return mid;
                }
                if(target > arr[mid]) {
                    s = mid+1;
                }
                else {
                    e = mid-1;
                }
            }
            return -1;
        }
}