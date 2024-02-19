import java.util.Arrays;
class LinearSearch02
{
    public static void main(String[] args) {
        String name = "Harshal";
        char target = 'h';
        // boolean har = linear(name,target);
        // System.out.println(har);xx   
        boolean h = linear(name,target);
        System.out.println(h);
        System.out.println(Arrays.toString(name.toCharArray()));
    }

     static boolean linear01(String name, char target) {
        if (name.length() ==0) {
            return false;
        }
        for(char ch : name.toCharArray()) {               //here we have use the for each loop 
            System.out.println(ch);   
            return true;
            }
        return false;
       
    }

    static boolean linear(String name, char target) {
        if (name.length() ==0) {
            return false;
        }

        for(int i =0;i< name.length();i++) {            //here we haave use the for loop
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
        
    }
}


