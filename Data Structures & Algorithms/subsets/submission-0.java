class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>());
        for (int num: nums){
            int size= a.size();
            for(int i=0; i<size; i++){
                List<Integer> s= new ArrayList<>(a.get(i));
                s.add(num);
                a.add(s);
            }
        }
        return a;
    }
}
