public class leetArr79 {
        public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[][] brackets = {{3,50},{7,10},{12,25}};
        int income = 10;
        double amount = 0.0d;
        if (income > brackets[0][0]) {
            amount = (3*brackets[0][1])/100d;
            System.out.println(amount);
        }
        for ( int i = 1; i < brackets.length; i++) {
            int bound = Math.min(brackets[i][0], income);
            int dollar = bound - brackets[i-1][0]; 
            if (dollar < 0) break;
            amount += (dollar*brackets[i][1])/100d;
            System.out.println(amount);
        }
    }
}
