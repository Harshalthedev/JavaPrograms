public class leetArr147 {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int max = numBottles;
        while (numBottles >= numExchange) {
            int drink = numBottles / numExchange;
            max += drink;
            numBottles = drink + (numBottles % numExchange);
        }
        return max;
    }
}
