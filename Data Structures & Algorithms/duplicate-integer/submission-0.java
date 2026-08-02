class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ht = new HashSet<>();

        for(int num: nums){
            if(!ht.add(num)){
                return true;
            }
        }

        return false;
    }
}