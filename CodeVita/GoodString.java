import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading input
        String goodString = sc.nextLine();
        String name = sc.nextLine();
        
        // Variable to store total distance
        int totalDistance = 0;
        
        // Start with the first character of goodString as the previous good letter
        char previousGoodChar = goodString.charAt(0);

        // Iterate through each character in the name
        for (char ch : name.toCharArray()) {
            // Variable to track the minimum distance
            int minDistance = Integer.MAX_VALUE;
            char bestGoodChar = goodString.charAt(0);
            
            // Find the closest good character
            for (char goodChar : goodString.toCharArray()) {
                int currentDistance = Math.abs(ch - goodChar);

                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                    bestGoodChar = goodChar;
                } else if (currentDistance == minDistance && Math.abs(previousGoodChar - goodChar) < Math.abs(previousGoodChar - bestGoodChar)) {
                    bestGoodChar = goodChar;
                }
            }

            // Add the distance to totalDistance if ch is not already in goodString
            if (ch != bestGoodChar) {
                totalDistance += Math.abs(ch - bestGoodChar);
                previousGoodChar = bestGoodChar;
            }
        }

        // Print the total distance
        System.out.println(totalDistance);
    }
}
