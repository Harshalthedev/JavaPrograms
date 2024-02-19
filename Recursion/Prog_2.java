public class Prog_2 {
    public static void main(String[] args)
    {
        print(1);
    }
    static void print(int n)
    {
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        else 
           System.out.println(n);
           print(n+1);
    }
}