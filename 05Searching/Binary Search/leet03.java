public class leet03 {
    public static void main(String[] args)
    {
        char[] letters = {'c','f','j'};
        System.out.println(letter(letters, 'h'));
    }
    static char letter(char[] letters,char target)
    {

        int l=0;
        int h=letters.length-1;
        
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(target > letters[mid]) {
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        return letters[l%letters.length];
    }
}