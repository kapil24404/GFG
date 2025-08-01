// class Solution {
//     public int findSum(String s) {
//         // code here
//         int sum=0;
//         int n=s.length();
//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             if(ch-'0'>=0 && ch-'0'<=9){
//                 sum+=ch-'0';
//             }
//         }
//         return sum;
//     }
// }

class Solution {
    public static int findSum(String s) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0'; 
                temp = temp * 10 + digit; 
            } else {
                sum += temp; 
                temp = 0;    
            }
        }
        sum += temp;

        return sum;
        
    }
}