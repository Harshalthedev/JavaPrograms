import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetArr126 {
    public static void main(String[] args) {
        // List<Integer> list2 = Arrays.asList(1,0,0,1,0,0,1,1,1,0,0,0,0,0,0);
        List<Integer> list2 = Arrays.asList(1,0,1);
        LinkedList<Integer> head = new LinkedList<>(list2);
        String binary = "";
        for (int val : head) {
            binary += val;
        }
        System.out.println(getDecimalValue(0, 1, binary));
    }
    public static int getDecimalValue(int decimal, int base, String binary) {
        if (binary.isEmpty()) {
            return decimal;
        }
        char lastChar = binary.charAt(binary.length() - 1);
        int bitValue = (lastChar == '1') ? base : 0;
        return getDecimalValue(decimal + bitValue, base*2, 
            binary.substring(0, binary.length()-1));
    }
}
