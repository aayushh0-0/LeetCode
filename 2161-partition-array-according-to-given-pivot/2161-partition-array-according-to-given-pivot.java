class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> l = new ArrayList<>();

        for (int a : nums) {
            if (a < pivot) {
                l.add(a);
            }
        }

        for (int a : nums) {
            if (a == pivot) {
                l.add(a);
            }
        }

        for (int a : nums) {
            if (a > pivot) {
                l.add(a);
            }
        }

        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}