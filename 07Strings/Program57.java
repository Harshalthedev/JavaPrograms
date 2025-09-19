public class Program57 {
    static int[][] grid = new int[3][26];
    public static void main(String[] args) {
        // System.out.println(getValue("=5+7"));
        setCell("A1",10);
        setCell("B2",15);
        System.out.println(getValue("=A1+B2"));
        //[[3],["=5+7"],["A1",10],["=A1+6"],["B2",15],["=A1+B2"],["A1"],["=A1+B2"]]

    }

    public static void setCell(String cell, int value) {
        char ch = cell.charAt(0);
        int num = Integer.parseInt(cell.substring(1));
        grid[num-1][ch - 'A'] = value;
    }
    
    public static void resetCell(String cell) {
        char ch = cell.charAt(0);
        int num = Integer.parseInt(cell.substring(1));
        grid[num-1][ch - 'A'] = 0;
        
    }
    public static int getValue(String formula) {
        String[] s = formula.substring(1).split("\\+");
        char ch1 = '-';
        int num1 = 0;
        if (Character.isLetter(s[0].charAt(0))) {
            ch1 = s[0].charAt(0);
            num1 = Integer.parseInt(s[0].substring(1));
        }
        else num1 = Integer.parseInt(s[0]);
        char ch2 = '-';
        int num2 = 0;
        if (Character.isLetter(s[1].charAt(0))) {
            ch2 = s[1].charAt(0);
            num2 = Integer.parseInt(s[1].substring(1));
        }
        else num2 = Integer.parseInt(s[1]);
        int x = 0;
        int y = 0;
        if (ch1 != '-')  x = grid[num1-1][ch1 - 'A'];
        else x = num1;
        if (ch2 != '-')  y = grid[num2-1][ch2 - 'A'];
        else y = num2;
        return x + y;
    }
}
