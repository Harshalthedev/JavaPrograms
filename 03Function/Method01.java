
class Method01
{
    public static int add(int x, int y)
    {
        int sum = x+y;
        return sum;
    }
    public static void main(String[] args)
    {
        int sum = add(5,5);  // method calling
        System.out.println("the sum is "+sum);
    }
}