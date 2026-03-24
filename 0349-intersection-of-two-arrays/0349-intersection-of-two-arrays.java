class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> intersection = new HashSet<>();
        int l1 = 0;
        int l2 = 0;

        while (l1 < nums1.length && l2 < nums2.length) {
            if (nums1[l1] == nums2[l2]) {
                intersection.add(nums1[l1]);
                l1++;
                l2++;
            } else if (nums1[l1] > nums2[l2]) {
                l2++;
            } else {
                l1++;
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;

        for (int ele : intersection) {
            result[index++] = ele;
        }

        return result;
    }
}