import java.util.ArrayList;
import java.util.Scanner;
class ArrayList02 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> lines  = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int linelength = in.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for(int j =0;j<linelength;j++)
            {
                line.add(in.nextInt());
            }
            lines.add(line);
        }
        int q  = in.nextInt();
        for(int i = 0;i<q;i++)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            if(x <=lines.size() && y <= lines.get(x-1).size())
            {
                System.out.println(lines.get(x - 1).get(y - 1));
            }
            else{
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
    
}
