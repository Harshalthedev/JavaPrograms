class Quick {
    static void quick(int[] arr,int l,int h) {
        if(l<h) {
            int pi = partition(arr,l,h);
            quick(arr, l, pi-1);
            quick(arr, pi+1, h);

        }
    }
    static int partition(int[] arr,int l, int h) {
        int pivot = arr[h];
        int i = l-1;
        for (int j = l; j < h; j++) {
            if( arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }
    static void printArr(int[] arr,int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,6,2};
        int n = arr.length-1;
        quick(arr,0,n);
        printArr(arr,n);
    }
}