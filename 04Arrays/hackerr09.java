class hackerr09 {
    public static void main(String[] args) {
        char[] name = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X','Y','Z'};
        int count = 4;
        // System.out.println(name.length);
        // int mul = 0;
        // int temp =0;
        // for (int i = 0; i < name.length; i++) {
        //     if (mul <=name.length) {
        //         mul = mul+4;
        //         temp = mul;
        //     }
        // }
        // System.out.println(temp);

        for (int i = 0; i < name.length; i++) {
            if(i < count) {
                System.out.print(name[i]);
            }
            else{
                i = i-1;
                System.out.println();
                count = count+4;
            }
            
        }
    }
}