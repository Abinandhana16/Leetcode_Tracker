// Last updated: 7/14/2026, 2:12:39 PM
class Solution {
    public boolean isValid(String s) {
        while(s.contains("[]")||s.contains("()")||s.contains("{}")){
            s = s.replace("[]","");
            s = s.replace("()","");
            s = s.replace("{}","");
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}