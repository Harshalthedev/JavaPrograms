class Code1 {
    public static void main(String[] args) {
        // int[] arr = {8, 10, 6, 2,9, 7};
        int[] arr = {8, 3,6,1,2,0,1};
        // int[] arr = {8,0,0};
        int n =7;
        System.out.println(find_superior_ele(arr, n));
    }
    public static int find_superior_ele(int[] arr, int n) {
        int total_sup_ele = 0;
        int min = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            if (min < arr[i]) {
                min = arr[i];
                total_sup_ele++;
            }
        }
        return total_sup_ele;
    }
}