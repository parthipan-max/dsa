class Solution {
    public int romanToInt(String s) {

        int sum = 0;

        for(int i = 0; i < s.length(); i++){

            int value1 = value(s.charAt(i));

            if(i + 1 < s.length()){
                int value2 = value(s.charAt(i + 1));

                if(value1 < value2){
                    sum -= value1;
                } else {
                    sum += value1;
                }
            } else {
                sum += value1;
            }
        }

        return sum;
    }

    public int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}