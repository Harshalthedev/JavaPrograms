class Program01 {
    public static void main(String[] args) {
        String temp = null;
        String[] str = {
            "Praveen",  
            "Yuvraj",  
            "Harbhajan",  
            "Jay",  
            "Virat",  
            "Rohit", 
            "Axar", 
            "Sandeep",  
            "Anand"
        };
        sortArrayAsc(str,temp);
    }
        // Print sorted array
    public static void sortArrayAsc(String[] str,String temp) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].compareTo(str[j]) > 0 ){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
            // Arrays.sort(str,Comparator.comparingInt(String :: length));
        }
        for (String s : str) {
            System.out.println(s);
        }
    }
}
