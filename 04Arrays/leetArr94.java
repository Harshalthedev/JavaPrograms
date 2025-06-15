public class leetArr94 {
    public static void main(String[] args) {
        System.out.println(garbageCollection(new String[] {"G","P","GP","GG"}, new int[] {2,4,3}));
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int time = 0;
        String s = "MGP";
        for (char ch : s.toCharArray()) {
            for (int i = 0; i < garbage.length; i++) {
                boolean grb = false;
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (ch == garbage[i].charAt(j)) {
                        grb = true;
                        time++;
                    }
                }
                if (grb && i > 0) time += travel[i-1];
                System.out.println(time);
            }
        }
        return time;
    }
}
