class Solution {
    public int maxProduct(int n) {
        List<Integer> list=new ArrayList<>();
        int a=n;
        while(a!=0){
            list.add(a%10);
            a/=10;
        }
        Collections.sort(list);
        int c=list.get(list.size()-1);
        int d=list.get(list.size()-2);
        return c*d;
    }
}