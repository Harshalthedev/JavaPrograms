package Bits.Operator;

public class Gates {
    public static void main(String[] args) {
        int a = 10; // binary number = 1010
        int b = 5; // binary number = 0101
        
        //  AND opration
        int and = a & b;
        System.out.println(and);
        //  OR opration
        int or = a | b;
        System.out.println(or);
        //  XOR opration
        int xor = a ^ b;
        System.out.println(xor);
        //  COMPLEMENT opration
        int complement = ~a;
        System.out.println(complement);
    }
}
