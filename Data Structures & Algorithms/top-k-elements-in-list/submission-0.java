class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min-heap based on frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        // Step 3: Keep heap size k
        for (int key : freq.keySet()) {
            pq.offer(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Build result
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll();
        }

        return res;
    }
}
