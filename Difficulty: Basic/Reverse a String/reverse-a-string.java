// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            ans.append(s.charAt(i));
        }
        return ans.reverse().toString();
    }
}