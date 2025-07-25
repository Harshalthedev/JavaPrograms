public class leetArr119 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right-left);
            max = Math.max(max, area);
            if (height[left] > height[right]) {
                right--;
            } else
                left++;
        }
        return max;
    }
}
