import java.util.Scanner;
class Multidinal02
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the number of rows: ");
        int row = in.nextInt();

        System.out.println("Ente the enumber of column: ");
        int col = in.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("enter the array element");
         
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
              arr[row][col] = in.nextInt();
            }
        }
        System.out.println("array is: ");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.println(arr[row][col]+" ");
            }
        
        System.out.println();
        }
        in.close();
    }
}
// import java.util.Scanner; public class Multidinal02

// {

// public static void main(String[] args)
// {
//     Scanner sc=new Scanner(System.in);

// int r=sc.nextInt();

// int c=sc.nextInt(); int [][]a=new int[r][c];

// for (int i=0;i<a.length; i++)

// {
//     for(int j=0;j<a[0].length; i++)
//     { 
//         a[i][j]=sc.nextInt();
//     }
// }       

// for (int i=0;i<a.length;i++)
// {

//     for (int j=0;j<a[0].length;i++) 
//     System.out.print(a[i][j]+" ");
// } 
//     System.out.println();
// }

// }