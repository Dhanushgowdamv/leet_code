class Solution {// tc is o(n) and sc is O(1)
    public void moveZeroes(int[] nums) {
        int insertpos = 0;
        for(int num:nums){
            if(num!=0){
                nums[insertpos++] = num;
            }
        }
        while (insertpos < nums.length) {
            nums[insertpos++] = 0;
        }

    }
}