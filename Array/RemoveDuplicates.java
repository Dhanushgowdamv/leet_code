public public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        // If the array is empty or has only one element, return its length
        if (nums.length == 0) return 0;
        
        // Initialize a pointer for the position of unique elements
        int uniqueIndex = 0;

        // Iterate through the array, comparing each element with the last unique one
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next position
                nums[uniqueIndex] = nums[i]; // Update with the unique element
            }
        }

        // Return the count of unique elements
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);

        System.out.println("Length of array with unique elements: " + length);
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

