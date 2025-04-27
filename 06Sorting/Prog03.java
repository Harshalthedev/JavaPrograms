class  Prog03 {
    public static void main(String[] args) {
        int[] nums = {-1,-4,-1,4};
        int cnt = 0;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j-2]+nums[j] == (double)nums[j-1]/2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
