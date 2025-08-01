class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i =0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        
        return '$';
    }
}
