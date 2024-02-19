class varlenargs02
{
    public static void main(String[] args)
    {
        System.out.println("this is varargs");
        har(25,"india","japan");
    }  
    static void har(int a,String ...s)
    {
        System.out.println(a+" is number");
        for(String x:s)
        {
            System.out.println(x);
        }
    }  
}
