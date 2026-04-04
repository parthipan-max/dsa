class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int numsum=0;
        for(int num:nums){
            numsum+=num;
        }
        return sum-numsum;


    }
}