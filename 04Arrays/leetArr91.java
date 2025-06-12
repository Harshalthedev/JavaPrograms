import java.util.*;
public class leetArr91 {
    public static void main(String[] args) {  
        System.out.println(commonFactors(12, 6));    
    }
    public static int commonFactors(int a, int b) {
        int count = 0;
        int n = Math.min(a,b);
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) count++;
        }   
        return count;
    }
}
