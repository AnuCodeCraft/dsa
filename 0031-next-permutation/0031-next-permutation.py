class Solution:
    def nextPermutation(self, nums: list[int]) -> None:
        n = len(nums)
        if n==1:
            return
        small_pos=-1
        for i in range(n-2, -1, -1):
            if nums[i]>=nums[i+1]:
                continue
            else:
                small_pos=i
                break
        ele_pos=n-1
        next_ele=inf
        for i in range(n-1, small_pos, -1):
            if nums[small_pos]<nums[i] and nums[i]<next_ele:
                ele_pos=i
                next_ele=nums[i]
        nums[small_pos], nums[ele_pos] = nums[ele_pos], nums[small_pos]
        nums[small_pos+1:] = sorted(nums[small_pos+1:])
