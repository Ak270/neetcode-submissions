class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Create buckets
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }

        // Place numbers into buckets based on frequency
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            bucket.get(count).add(num);
        }

        int[] res = new int[k];
        int idx = 0;

        // Collect top k frequent elements
        for (int i = bucket.size() - 1; i >= 0 && idx < k; i--) {
            for (int num : bucket.get(i)) {
                res[idx++] = num;
                if (idx == k) {
                    break;
                }
            }
        }

        return res;
    }
}
