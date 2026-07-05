class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int j=i-1;
            while(j>=0){
                if(nums[i]+nums[j]==target){
                   return new int[]{j,i};
                }
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
