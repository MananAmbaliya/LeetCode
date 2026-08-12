class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> li = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                li.add(i);
            }
        }

        return li;
    }
}