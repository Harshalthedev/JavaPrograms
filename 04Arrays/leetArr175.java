import java.util.Arrays;

public class leetArr175 {
    public static void main(String[] args) {
        int n = 3;
        int[][] buildings = {{1,2},{2,2},{3,2},{2,1},{2,3}};
        int[][] row = new int[n][2];
        for (int[] is : row) {
            Arrays.fill(is, Integer.MIN_VALUE);
        }
        
        int[][] col = new int[n][2];
        for (int[] is : col) {
            Arrays.fill(is, Integer.MIN_VALUE);
        }

        Arrays.sort(buildings, (a,b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            else return Integer.compare(a[1], b[1]);
        });
        for (int[] is : buildings) {
            System.out.println((is[0]-1)+" "+(is[1]-1));
        }
        for (int[] building : buildings) { 
            //rows
            int a = building[0]-1;
            int b = building[1]-1;
            if(row[a][0] == Integer.MIN_VALUE) row[a][0] = b;
            if (row[a][1] == Integer.MIN_VALUE) row[a][1] = b;  
            else {
                row[a][0] = Math.min(row[a][0], b);
                row[a][1] = Math.max(row[a][1], b);
            }
            System.out.println(row[a][0]);
        }
        System.out.println("rows");
        for (int[] is : row) {
            System.out.println(is[0]+" "+is[1]);
        }
    }
}
