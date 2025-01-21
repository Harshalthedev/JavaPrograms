class Program09 {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(countSteps(n,0));
    }
    static int countSteps(int n, int steps) {
        if ( n == 0 ) return steps;
        
        if ( n % 2 == 0)  n /= 2;
        
        else  n--;
        
        return countSteps(n, ++steps);
    }
}