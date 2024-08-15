import java.util.ArrayList;

public class Insertion_arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(12);
        arrlist.add(5);
        arrlist.add(1);
        arrlist.add(6);
        arrlist.add(18);
        arrlist.add(3);
        arrlist.add(11);
        arrlist.add(4);
        arrlist.add(9);
        int n = arrlist.size();
        for (int i = 1; i < n; i++) {
            int j = i-1;
            int key = arrlist.get(i);
            while(j >=0 && arrlist.get(j) > key) {
                arrlist.set(j+1,arrlist.get(j));
                j--;
            }
            arrlist.set(j+1,key);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrlist.get(i)+" ");
        }
    }
}
