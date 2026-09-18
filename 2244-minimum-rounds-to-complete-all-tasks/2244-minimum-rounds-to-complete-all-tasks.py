class Solution:
    def minimumRounds(self, tasks: list[int]) -> int:
        mp = collections.defaultdict(int)
        for task in tasks:
            mp[task]+=1
        ans=0
        for key, val in mp.items():
            if val==1:
                return -1
            if val%3==0:
                ans+=(val//3)
            elif val%3==2:
                ans+=(val//3)+1
            else:
                ans+=((val//3)-1)
                val-=((val//3)-1)*3
                ans+=(val//2)
        return ans
