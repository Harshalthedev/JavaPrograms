public class Program60 {
    public static void main(String[] args) {
        // System.out.println(compareVersion("1.2", "1.10"));
        System.out.println(compareVersion("1.0.1", "1"));
    }
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int n = Math.min(v1.length, v2.length);
        int i = 0;
        for (; i < n; i++) {
            int a = 0;
            int b = 0;
            if (v1[i].charAt(0) == '0') {
                a = convertInt(v1[i]);
            }
            else a = Integer.parseInt(v1[i]);
            if (v2[i].charAt(0) == '0') {
                b = convertInt(v2[i]);
            }
            else b = Integer.parseInt(v2[i]);
            if (a < b) cnt1++;
            else if (a > b) cnt2++;
            else cnt3++;
        }
        cnt3 += version1.length() != version2.length() ? Math.max(v1.length, v2.length) - i: 0;
        if (cnt1 >= cnt2 && cnt1 >= cnt3) return -1;
        else if (cnt2 >= cnt1 && cnt2 >= cnt3) return 1;
        return 0;
    
    }
    public static int convertInt(String s) {
        int j = 0;
        while (s.charAt(j) == '0') {
            j++;
        }
        return Integer.parseInt(s.substring(j));
    }
}