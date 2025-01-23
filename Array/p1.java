public class p1 {
    public static void printlargest(int arr[], int n){
        int largest = arr[0];
        for(int i=0 ;i<n;i++){
            if(arr[i] > largest){
               largest = arr[i];
            }

        }
        System.out.println(largest);

    
    }

    public class CheckSorted {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // Compare adjacent elements
                return false;
            }
        }
        return true;
    }

   
}

    public static void main(String[] args) {
        int arr[] = {1,2,5,2,6,7,8};
        printlargest(arr, arr.length);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr)); // Output: true
    }
}
