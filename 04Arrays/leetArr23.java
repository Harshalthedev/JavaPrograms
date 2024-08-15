import java.util.*;
public class leetArr23 {
    public static void main(String[] args) {
        int[] mountain = {1,4,3,8,5};

        // ArraysList<Integer> list = new ArraysList()<>;
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 1 ; i < mountain.length-1 ; i++) {
            if (mountain[i-1] < mountain[i] && mountain[i] > mountain[i+1]) {
                list.add(mountain[i]);
            }
        }
        
    }
}
