class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String str: strs){

            int[] hash = new int[26];

            for (char c : str.toCharArray()) {
                hash[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();

            for (int num : hash) {
                sb.append(num).append("#");
            }
            String s = sb.toString();
            System.out.println(s);
            if(!hm.containsKey(s)){
                hm.put(s, new ArrayList<>());
            }
            hm.get(s).add(str);
        }
    return new ArrayList<>(hm.values());
    }
}
