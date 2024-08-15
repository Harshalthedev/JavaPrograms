public class leet {
    public static void main(String[] args) {
        int n =20 , time =9;
        int rounds = time / (n-1);
        if(rounds % 2 == 0){
            System.out.println(1 + time % (n-1));
        }
        else {
            System.out.println(n - time % (n-1));
        } 
    }
}
