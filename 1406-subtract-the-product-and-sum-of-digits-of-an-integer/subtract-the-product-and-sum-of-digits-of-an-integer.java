class Solution {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static int pdt(int n){
        int pdt=1;
        while(n>0){
            pdt*=n%10;
            n=n/10;
        }
        return pdt;
    }
    public int subtractProductAndSum(int n) {
        return pdt(n)-sum(n);
    }
}