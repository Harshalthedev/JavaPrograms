public class Hello {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l = 0;
        int r = str.length()-1;
        while ( l <= r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
}
