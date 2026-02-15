public class Prob06 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,6};
        int cnt = 0;
        boolean incre = false;
        boolean decre = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (i == 0 && nums[i] > nums[i+1]) {System.out.println(false); break;}
            if (nums[i] < nums[i+1]) incre = true;
            else if (incre) {
                cnt++;
                incre = false;
            }
        }
        if (incre) cnt++;
        System.out.println(cnt == 3);
    }
}
