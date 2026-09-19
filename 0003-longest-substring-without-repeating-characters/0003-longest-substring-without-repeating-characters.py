class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        mp = collections.defaultdict(int)
        ans=0
        j=0
        n = len(s)
        for i in range(0, n):
            c = s[i]
            mp[c]+=1
            while mp[c]>1:
                mp[s[j]]-=1
                j+=1
            ans=max(ans, i-j+1)
        return ans