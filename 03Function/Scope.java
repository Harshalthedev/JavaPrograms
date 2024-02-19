class Scope
{
    public static void main(String[] args)
    {
            int a =40;        //already initialize outside the block
            // int b =45;
            String name = "harshal";

            {                  //here we have made a block and initialize some values and those values can used 
                               //through this program only,know as scoping
                a = 99;
                int c =69;
                int d = 25;
                System.out.println(d+" this value of d is initialize inside the block");
                System.out.println(c);
                name = "harry";
                System.out.println(name);
                a = 1000;     //we can reinitialize the original value again and again
            }
            // System.out.println(c);     //here c gives an error as it is used outside the block
            int d = 66;
            System.out.println(d+" this d is initialize outside the block as it dont know it is in the block"); 
            System.out.println(a);        //it prints the new assign value from the original value
            System.out.println(name);  

            
    }
    static void random(int marks)
    {
        int num = 37;
        System.out.println(num);
        System.out.println(marks);
    }
}
