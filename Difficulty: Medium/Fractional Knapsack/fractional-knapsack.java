class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n=values.length;
        double ratio[][]=new double[n][2];
        for(int i=0;i<n;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)values[i]/weights[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        double val=0;
        for(int i=n-1;i>=0;i--){
            int ind=(int)ratio[i][0];
            if(W>=weights[ind]){
                val+=values[ind];
                W-=weights[ind];
            }
            else{
                val+=(ratio[i][1]*W);
                W=0;
                break;
            }
        }
        return val;
    }
}