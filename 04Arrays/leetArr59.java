public class leetArr59 {
    public static void main(String[] args) {
        System.out.println(addBinary("100","110010"));
    }
    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        
        int base1 = 1;
        int dec1 = 0;
        while ( num1 != 0) {
            dec1 += (num1 % 10) * base1;
            num1 /= 10;
            base1 *= 2; 
        }

        System.out.println(dec1);
        int dec2 = 0;
        int base2 = 1;
        while ( num2 != 0) {
            dec2 += (num2 % 10) * base2;
            num2 /= 10;
            base2 *= 2; 
        }
        System.out.println(dec2);
        int dec = dec1+dec2;
        System.out.println(dec);
        return Integer.toBinaryString(dec);
    }
}
