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
    public static void main(String[] args) {
        int arr[] = {1,2,5,2,6,7,8};
        printlargest(arr, arr.length);
    }
}
