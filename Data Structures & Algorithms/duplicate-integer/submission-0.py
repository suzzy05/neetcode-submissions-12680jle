class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        c=0
        for i in range(len(nums)):
            a=nums[i]
            if a in nums[i+1:]:
                return True
        return False
