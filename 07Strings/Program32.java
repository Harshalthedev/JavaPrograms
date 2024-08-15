public class Program32 {
    public static void main(String[] args) {

        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";
        StringBuilder sb = new StringBuilder();
        long n1 = 0;
        long n2 = 0;
        int n3 = 0 ;
        int n4 = 0 ;
        for ( int i = 0; i < num1.length() ; i++ ) {
            if (num1.charAt(i) == '0'){
                n3 = 0;
            }
            else if (num1.charAt(i) == '1'){
                n3 = 1;
            }
            else if (num1.charAt(i) == '2'){
                n3 = 2;
            }
            else if (num1.charAt(i) == '3'){
                n3 = 3;
            }
            else if (num1.charAt(i) == '4'){
                n3 = 4;
            }
            else if (num1.charAt(i) == '5'){
                n3 = 5;
            }
            else if (num1.charAt(i) == '6'){
                n3 = 6;
            }
            else if (num1.charAt(i) == '7'){
                n3 = 7;
            }
            else if (num1.charAt(i) == '8'){
                n3 = 8;
            }
            else if (num1.charAt(i) == '9'){
                n3 = 9;
            }
            n1 = (10 * n1 ) + n3; 
        }
        for ( int i = 0; i < num2.length() ; i++ ) {
            if (num2.charAt(i) == '0'){
                n4 = 0;
            }
            else if (num2.charAt(i) == '1'){
                n4 = 1;
            }
            else if (num2.charAt(i) == '2'){
                n4 = 2;
            }
            else if (num2.charAt(i) == '3'){
                n4 = 3;
            }
            else if (num2.charAt(i) == '4'){
                n4 = 4;
            }
            else if (num2.charAt(i) == '5'){
                n4 = 5;
            }
            else if (num2.charAt(i) == '6'){
                n4 = 6;
            }
            else if (num2.charAt(i) == '7'){
                n4 = 7;
            }
            else if (num2.charAt(i) == '8'){
                n4 = 8;
            }
            else if (num2.charAt(i) == '9'){
                n4 = 9;
            }
            n2 = (10 * n2 ) + n4; 
        }
        long sum = n1 + n2;
        System.out.println(sb.append(sum).toString());   
    }
}
