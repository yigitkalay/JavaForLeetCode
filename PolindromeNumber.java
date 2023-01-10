class Solution {
    public boolean isPalindrome(int x) {
        boolean result=false;
        int check=0;
        String number=Integer.toString(x);
        for(int i=1;i<number.length()/2+1;i++){
                if(number.charAt(i-1)==number.charAt(number.length()-i)){
                    check++;
                }
        }
        if(check==(number.length()/2)){
            result=true;
        }
        return result;
    }
}
