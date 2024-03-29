public class leet06 {
    public static void main(String[] args) {
       int[] arr ={1,2,3,5,14,2,1};
       System.out.println(findPeakElement(arr,0,arr.length-1));
    }
    static int findPeakElement(int[] arr,int s,int e) {
        while (s<e) {
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]) {
                e = mid;
            }
            else s = mid+1;
        }
        return arr[s];
    }
}

// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/Harshalthedev/Javaprograms.git
// git push -u origin main