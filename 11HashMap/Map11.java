import java.util.HashMap;

public class Map11 {
    public static void main(String[] args) {
        System.out.println(numRabbits(new int[] {0,1,1,0,0}));
    }    
    public static int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int num : answers) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int minRabbit = 0;
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count <= key+1) {
                minRabbit += key+1;
            }
            else {
                int groupSize = key+1;
                int imaginery = (int) Math.ceil((double) count/groupSize);
                minRabbit += imaginery;
            }
        }
        return minRabbit;
    }
}