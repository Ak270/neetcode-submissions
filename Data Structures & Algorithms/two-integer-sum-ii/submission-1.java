class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Integer n = numbers.length;
        Integer sum=0, i=0, j=n-1;

        int[] res = new int[2];
        while(i<j){
            sum = numbers[i] + numbers[j];

            if(sum == target) {
                res[0] = i+1;
                res[1] = j+1;
                break;
            } 
            else if(sum > target) {
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
