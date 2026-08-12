class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();

        int n1 = nums1.length - 1;
        int n2 = nums2.length - 1;

        while (n1 >= 0 && n2 >= 0) {
            if (nums1[n1] == nums2[n2]) {
                set.add(nums1[n1]);
                n1--;
                n2--;
            } else if (nums1[n1] > nums2[n2]) {
                n1--;
            } else {
                n2--;
            }
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i] = num;
            i++;
        }
        return result;
    }
}