public class Arrays05 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        int index =0;
        System.out.println(num(nums,index));
    }
    static int num(int[] nums,int index)
    {
        int max = nums[0];
        for(int i=0;i<nums.length;i++) {
          if(max < nums[i]) {
              max = nums[i];     
              index = i;
              
          }
        } 
      return index; 
    }
}
