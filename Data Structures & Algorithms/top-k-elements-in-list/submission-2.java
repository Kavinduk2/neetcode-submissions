class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int current : nums) {

            if (map.containsKey(current)) {
                int value = map.get(current);
                value++;
                map.put(current, value);

            } else {
                map.put(current, 1);
            }
        }

    
        int[] result = new int[k];

        
        for (int i = 0; i < k; i++) {

            int highest = 0;
            int highestKey = 0;

            for (Integer key : map.keySet()) {

                int frequency = map.get(key);

                if (highest < frequency) {
                    highest = frequency;
                    highestKey = key;
                }
            }

        
            result[i] = highestKey;

        
            map.remove(highestKey);
        }

        return result;
    }
}
