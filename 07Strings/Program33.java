public class Program33 {
    public static void main(String[] args) {
        String s = "sgawtb";
        char letter = 's'; // Change this to any specific letter you want to check, for example 'g', 'a', etc.

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        int percentage = count * 100 / s.length();
        System.out.println(percentage + "%");
    }
}
