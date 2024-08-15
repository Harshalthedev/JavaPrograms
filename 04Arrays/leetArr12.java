import java.util.Arrays;

public class leetArr12 {
    public static void main(String[] args) {
        int[] seats = {4,1,5,9};
        int[] students = {1,3,2,6};
        
        int count = 0 ;
        Arrays.sort(seats);
        Arrays.sort(students);

        for ( int j = 0 ; j < seats.length ; j++ ) {
            count = count + Math.abs(students[j] - seats[j]) ;
        }   
        System.out.println(count);
    }
}
