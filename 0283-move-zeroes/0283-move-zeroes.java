class Solution {// tc is o(n) and sc is O(1)
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for(int fast=0 ; fast < nums.length;fast++){
            if(nums[fast] !=0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;

                slow++;
            }
            
        }
    }
}