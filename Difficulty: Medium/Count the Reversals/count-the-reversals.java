class Solution {
    public int countMinReversals(String s) {
        // code here
        int n=s.length();
        if(n%2!=0) return -1;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{') st.push(ch);
            else{
                if(!st.isEmpty() && st.peek()=='{'){
                 st.pop();   
                }
                else{
                    st.push(ch);
                }
            }
        }
        
         int open = 0, close = 0;
        for (char ch : st) {
            if (ch == '{') open++;
            else close++;
        }

        return (open + 1) / 2 + (close + 1) / 2;
    }
}