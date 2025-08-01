public class leetArr146 {
    public static void main(String[] args) {
        System.out.println(countCollisions("RLRSLL"));
    }
    public static int countCollisions(String directions) {
        int n = directions.length();
        int start = 0, end = n-1;

        while (start < n && directions.charAt(start) == 'L') {
            start++;
        }

        while (end >= 0 && directions.charAt(end) == 'R') {
            end--;
        }

        int collisions = 0;
        for (int i = start; i <= end; i++) {
            char ch = directions.charAt(i);
            if (ch == 'L' || ch == 'R') collisions++;
        }
        return collisions;
    }
}
