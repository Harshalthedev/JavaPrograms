class Program69 {
    public static void main(String[] args) {
       System.out.println(closestTarget(new String[] {"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"}, "zemkwvqrww",8)); 
    }
    public static int closestTarget(String[] words, String target, int startIndex) {
        if (words[startIndex].equals(target)) return 0;
        int n = words.length;
        int min = n+1;
        int r = (startIndex + 1) % n;
        while (r != startIndex) {
            if (words[r].equals(target)) {
                if (r > startIndex ) min = Math.min(min, r - startIndex);
                else min = Math.min(min, n - startIndex + r);
            }
            r = (r + 1) % n;
        }
        int l = (startIndex - 1 + n) % n;
        while (l != startIndex) {
            if (words[l].equals(target)) {
                if (startIndex > l) min = Math.min(min, startIndex - l);
                else min = Math.min(min, startIndex+n-l);
            }
            l = (l - 1 + n) % n;
        }
        return min == n+1 ? -1 : min;
    }
}