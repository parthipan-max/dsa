class Solution {
    public int mirrorDistance(int n) {
        int org=n;
        int x=0;
        while(n>0){
            int digit=n%10;
            x=x*10+digit;
            n=n/10;
        }
        return Math.abs(org-x);
    }
}