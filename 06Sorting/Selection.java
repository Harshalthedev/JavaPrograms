class Selection {
    public static void main(String[] args) {
        int[] arr = {5,9,6,1,4,7,2,3};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }       
    }
}