class Solution:
    def minimumRounds(self, tasks: list[int]) -> int:
        mp = collections.defaultdict(int)
        for task in tasks:
            mp[task]+=1
        ans=0
        for key, val in mp.items():
            if val==1:
                return -1
            ans+=val//3
            if val%3!=0:
                ans+=1
        return ans
