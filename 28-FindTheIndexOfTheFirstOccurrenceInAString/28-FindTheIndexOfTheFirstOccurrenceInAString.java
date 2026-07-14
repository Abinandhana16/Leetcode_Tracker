// Last updated: 7/14/2026, 2:12:33 PM
class Solution {
    public int strStr(String h, String n) {
        int a = h.length();
        int b = n.length();

        if(a==0||b==0){
            return -1;
        }
        for(int i=0;i<=a-b;i++){
            int j=0;
            while(j<b && h.charAt(i+j)==(n.charAt(j))){
                j++;
            }
            if(j==b){
                return i;
            }
        }
        return -1;
    }
}