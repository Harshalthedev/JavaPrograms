public class leetArr57 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] res = sortedSquares(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        
    }
        private static int n = 0;
    
        public static int[] sortedSquares(int[] nums) {
            n = nums.length;
    
            // Handle single-element case
            if (n == 1) {
                nums[0] = nums[0] * nums[0];
                return nums;
            }
    
            int[] res = new int[n];
    
            if (nums[0] < 0 && nums[n - 1] >= 0) {
                int ind = 0;
    
                // Convert negatives to positive and find last negative index
                for (int i = 0; i < n; i++) {
                    if (nums[i] < 0) {
                        nums[i] = -nums[i];
                        ind = i;
                    } else {
                        break;
                    }
                }
    
                reverse(0, ind, nums); // Reverse negative part
                square(nums); // Square all numbers
    
                // Merge two sorted halves
                int i = 0, j = ind + 1, k = 0;
                while (i <= ind && j < n) {
                    if (nums[i] < nums[j]) {
                        res[k++] = nums[i++];
                    } else {
                        res[k++] = nums[j++];
                    }
                }
    
                while (i <= ind) {
                    res[k++] = nums[i++];
                }
    
                while (j < n) {
                    res[k++] = nums[j++];
                }
    
            } else {
                if (nums[0] < 0 && nums[n - 1] < 0) {
                    reverse(0, n - 1, nums);
                }
                square(nums);
                return nums;
            }
    
            return res;
        }
    
        public static void square(int[] nums) {
            for (int i = 0; i < n; i++) {
                nums[i] = nums[i] * nums[i];
            }
        }
    
        public static void reverse(int l, int r, int[] nums) {
            while (l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
}
    
