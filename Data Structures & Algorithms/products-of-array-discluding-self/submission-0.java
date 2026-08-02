class Solution {
    public int[] productExceptSelf(int[] nums) {
        Integer pMult = 1, sMult=1, n=nums.length;
        int[] pm = new int[n];
        int[] sm = new int[n];
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            pm[i]=pMult;
            sm[n-i-1]=sMult;
            pMult *= nums[i];
            sMult *= nums[n-i-1];
        }

        for(int i=0; i<n; i++){
            res[i] = pm[i]*sm[i];
        }

        return res;
    }
}  
