public class leet04 {
    public static void main(String[] args) {
      int[] nums = {5,7,7,7,7,8,8,10,11};
          int[] result = searchRange(nums, 7);
          System.out.println("["+result[0]+","+result[1]+"]");
      }
       
    public static int[] searchRange(int[] nums,int target) {
      int[] ans = {-1,-1};
      int start = search(nums,target,true);
      int end = search(nums,target,false);
      ans[0] = start;
      ans[1] = end;
      return ans;
    } 
      static int search(int[] nums,int target,boolean findstartIndex) {
      int ans =-1;
      int l = 0;
      int h = nums.length-1;
      while(l<=h)
          {
              int mid = l+(h-l)/2;
              if(target > nums[mid]) {
                  l = mid+1;
              }
              else if(target <nums[mid]) {
                  h = mid-1;
              }
              else {
                  ans = mid;
                  if(findstartIndex) {
                      h = mid-1;
                  }
                  else {
                      l = mid+1;
                  }
              }
          }
          return ans;
      }
  }
  