class Hashcode {
    public static void main(String[] args) {


        // the hashcode is not the memory location for a reference , it is just an integer

        String str = "Harshal";
        int code = str.hashCode();    //it will print the hashcode for "Harshal"

        Integer n = 2500025;          
        int code1 = n.hashCode();      // it will print the number itself cause the number itself is unique        

        System.out.println(code);
        System.out.println(code1);
    }
}