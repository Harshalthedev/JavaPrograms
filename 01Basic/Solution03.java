// import java.util.Scanner;

class Solution03 {
    public static void main(String[] args) 
    {
        int[] arr = {12,25,96,78,25};
        int large = arr[0];
        int element=0;
        for(int i=0;i<arr.length;i++)
        {
            if(large<arr[i])
            {
                large = arr[i];
                element = i;
            }
        }
        System.out.println(element);
        

    }
}
