import java.util.Arrays;
import java.util.HashMap;

public class leetArrr53 {
    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        String[] str = findRelativeRanks(score);
        for (String i : str) {
            System.out.print(i+" ");
        }
    }
    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        // System.out.println(map);
        Arrays.sort(score);
        String[] str = new String[score.length];
        for ( int i = score.length-1; i >= 0; i--) {
            if ( i == score.length-1) {
                // System.out.println(map.get(score[i]));
                str[map.get(score[i])] = "Gold Medal";
            }
            else if ( i == score.length-2) {
                // System.out.println(map.get(score[i]));
                str[map.get(score[i])] = "Silver Medal";
            }
            else if( i == score.length-3) {
                // System.out.println(map.get(score[i]));
                str[map.get(score[i])] = "Bronze Medal";
            }
            else {
                str[map.get(score[i])] = Integer.toString(score.length-i);
            }
            // System.out.println(str[i]);
        }
        return str;
    }
}
