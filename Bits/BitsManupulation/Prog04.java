public class Prog04 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(3));
        System.out.println(smallestNumber(16));
    }
    public static int smallestNumber(int n) {
        int setBit = 1;
        while (setBit < n) {
            setBit = (setBit * 2) +1;
        }   
        return setBit;
    }
}
