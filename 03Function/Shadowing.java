class Shadowing
{
    static int a = 100;      //this is the shadowing as we can access the value of "a" all over the class
    public static void main(String[] args)
    {
        System.out.println(a);
        call();

    }
    static void call()
    {
        System.out.println(a);
    }
}