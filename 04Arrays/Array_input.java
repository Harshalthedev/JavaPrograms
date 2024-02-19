
class Array_input {
    public static void main(String[] args)
    {
        int nums[] = {12,15,16};
        System.out.println(buildArray(nums));
    }
    public static int[] buildArray(int[] nums)
    {    
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
        result[i] = nums [nums[i]]; 
        } 
        return result;
            
    }
}