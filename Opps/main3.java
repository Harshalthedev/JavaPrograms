import java.util.ArrayList;

public class main3 {
    public static void main(String[] args) {
        int[] nums = { -1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int j2 = j+1; j2 < nums.length; j2++) {
                    if ( nums[i]+ nums[j] + nums[j2] == 0 ) {
                        list.get(i).add(nums[i]);
                        list.get(i).add(nums[j]);
                        list.get(i).add(nums[j2]);
                        break;
                    }
                }
            }
        }
        System.out.println(list);
    }
}
