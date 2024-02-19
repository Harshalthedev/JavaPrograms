class overloading01
{
    public static void main(String[] args)    
    {
        har(25.03,58.36,54.96);
       har(25,28,96);
        har(26,59);
        har("india");
    }
    static void har(int a, int b, int c )
    {
        int sum = a+b+c;
        System.out.println(sum);
    }
    static void har(int a, int y)
    {
        int sum = a+y;
        System.out.println(sum);
    }
    static void har(double a,double m , double z)
    {
        double sum = a+m+z;
        System.out.println(sum);
    }
    static void har(String a)
    {
        System.out.println(a);
    }
}
