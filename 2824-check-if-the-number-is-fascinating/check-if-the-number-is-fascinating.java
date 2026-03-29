class Solution {
    public boolean isFascinating(int n) {
        int a=2*n;
        int b=3*n;
        String result=String.valueOf(n)+String.valueOf(a)+String.valueOf(b);
        if(result.length()!=9){
            return false;
        }
        char[] arr=result.toCharArray();
        Arrays.sort(arr);
        return new String (arr).equals("123456789");
        
    }
}