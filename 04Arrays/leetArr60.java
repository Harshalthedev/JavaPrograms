public class leetArr60 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
    }
    public static boolean isSameAfterReversals(int num) {
        System.out.println("num "+num);
        if ( num > 10 && num%10 == 0) return false;
        if (num <= 10) return true;
        int reverse1 = 0;
        while (num > 0) {
            reverse1 = (reverse1*10)+ num%10;
            num /= 10;
        }
        System.out.println(reverse1);
        int reverse2 = 0;
        while (reverse1 > 0) {
            reverse2 = (reverse2*10)+ reverse1%10;
            reverse1 /= 10;
        }
        System.out.println("reverse2 "+reverse2);
        return (reverse2 == num);
    }
}
