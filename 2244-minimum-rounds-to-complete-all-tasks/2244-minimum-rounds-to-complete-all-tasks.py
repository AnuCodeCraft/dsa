class Solution:
    def minimumRounds(self, tasks: list[int]) -> int:
        tasks.sort()
        n = len(tasks)
        if n==1:
            return -1
        cnt=1
        ans=0
        # print(tasks)
        i=1
        while i<n:
            while i<n and tasks[i]==tasks[i-1] :
                i+=1
                cnt+=1
            # print(cnt, i, tasks[i-1], ans)
            if cnt==1:
                # print("===",i, tasks[i-1], cnt)
                return -1
            ele = tasks[i-1]
            if cnt%3==0:
                ans+=cnt//3
            elif cnt%3==2:
                ans+=(cnt//3)+1
            elif cnt%3==1:
                ans+=(cnt//3)-1
                cnt-=((cnt//3)-1)*3
                ans+=(cnt//2)
            cnt=1
            i+=1
        if tasks[n-1]!=tasks[n-2]:
            return -1
        return ans