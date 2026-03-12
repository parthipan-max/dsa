class Solution {
    int sumofdig(int a){
        int sum=0;
        while(a!=0){
            sum=sum+(a%10);
            a=a/10;
        }
        return sum;
    }
    int product(int b){
        int pdt=1;
        while(b!=0){
            pdt=pdt*(b%10);
            b=b/10;
        }
        return pdt;
    }
    public boolean checkDivisibility(int n) {
        int a=sumofdig(n);
        int b=product(n);
        int sum=a+b;
        if(n%sum==0){
            return true;
        }
        return false;
    }
}