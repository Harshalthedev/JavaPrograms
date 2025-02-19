public class Hello {
    public static void main(String[] args) {
        String input = "Hello 123, it's 2024!";
        String output = input.replaceAll("[^0-9]", ""); 
        System.out.println(output); // Output: 1232024
    }
}
