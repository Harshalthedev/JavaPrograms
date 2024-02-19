class Pass_value
{
    public static void main(String[] args)
    {
        String name = "Harshal";
        changeName(name);                      // there is no change as the Strings are immutable due to security 
        System.out.println("hello i am "+name);


    int arr[] = {25,67,88,5};
    Change(arr);
    System.out.println(arr[0]);



    }
    static void changeName(String naam)
    {
        naam = "harry";               // here we have created an object
    }
    

    // when we use an array we can change the value 
    // that is know as the passing by value
    static void Change(int[] ar)
    {
        ar[0] = 40;              // here we have created an object and it can change the value
    }
}
