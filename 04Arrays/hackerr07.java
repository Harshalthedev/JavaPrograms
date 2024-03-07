public class hackerr07 {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    static void Bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] < arr[i] ) {
                    int temp  = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    static void Quick(int[] arr,int l ,int h) {
        if (l < h) {
            int pi = Partition(arr,l,h);
            Quick(arr,l,pi-1);
            Quick(arr,pi+1,h);
        }
    }
    static int Partition(int[] arr,int l,int h) {
        int pivot = arr[h];
        int i = l-1;
        for (int j = l; j < h; j++) {
            if (arr[j] < pivot) {
                i++ ;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] =temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,4,2};
        System.out.println("unsorted array");
        printArr(arr);

        // System.out.println("Selection Sorted array");
        // Selection(arr);
        // printArr(arr);
        // System.out.println("Insertion Sorted array");
        // Insertion(arr);
        // printArr(arr);
        // System.out.println("Bubble Sorted array");
        // Bubble(arr);
        // printArr(arr);
        System.out.println("Quick sorted array");
        Quick(arr,0,arr.length -1);
        printArr(arr);
    }
}
