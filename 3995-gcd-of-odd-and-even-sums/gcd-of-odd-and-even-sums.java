class Solution {
    public int gcdOfOddEvenSums(int n) {
        int z=n*2;
        int a=0;
        int b=0;
        for(int i=0;i<=z;i++){
            if(i%2==0){
                a+=i;
            }
            else{
                b+=i;
            }
        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}