class Solution {
    public int kthFactor(int n, int k) {
        int a=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(a==k){
                    return i;
                }
                a++;
            }
        }
        return -1;
    }
}