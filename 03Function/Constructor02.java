class Constructor02
{
    int id;
    String name;
    Constructor02(int id, String name)   
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("my name is "+name+" and age is "+id);
    }
    public static void main(String[] args)
    {
        Constructor02 ob01 = new Constructor02(19,"harshal");
        Constructor02 ob02 = new Constructor02(20,"harsh");
        ob01.display();
        ob02.display();
    }
}