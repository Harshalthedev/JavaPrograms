class Program09 {
    public static void main(String[] args) {
        int n = 3020400;
        System.out.println(countZeros(n,0));
    }
    static int countZeros(int n ,int count) {
        if (n==0) {
            return count;
        }
        if (n %10 == 0) {
            count++;
        }
        return countZeros(n/10 ,count);
    }
}