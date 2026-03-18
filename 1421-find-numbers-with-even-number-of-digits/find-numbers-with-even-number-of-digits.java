class Solution {
    private int countDigit(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int n :nums){
            int a=countDigit(n);
            if(a%2==0){
                c++;
            }
        }
        return c;
    }
}