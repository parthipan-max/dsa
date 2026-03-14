class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int sqr=0;
        for(int i=1;i<=nums.length;i++){
            sqr=0;
            if(nums.length% i ==0){
                sqr=nums[i-1]*nums[i-1];
                sum+=sqr;
            }
        }
        return sum;
    }
}