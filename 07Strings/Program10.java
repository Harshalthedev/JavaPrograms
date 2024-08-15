class Program10 {
    public static void main(String[] args) {
        // String[] operations = {"--X","X++","X++"};
        // String[] operations = {"++X","++X","X++"};
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }
    
    public static int finalValueAfterOperations(String[] operations) {

        int sum = 0;

        for ( int i = 0 ; i < operations.length ; i++ ) {

            if ( operations[i].equals("X++") || operations[i].equals("++X")) {
                sum = sum + 1; 
            }

            if ( operations[i].equals("--X") || operations[i].equals("X--")) {
                sum = sum - 1;
            }
        }
        
        return sum;
    }
}
