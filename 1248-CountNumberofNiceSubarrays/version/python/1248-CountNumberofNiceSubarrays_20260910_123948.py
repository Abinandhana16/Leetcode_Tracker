# Last updated: 9/10/2026, 12:39:48 PM
1class Solution:
2    def maxScore(self, cardPoints: List[int], k: int) -> int:
3        size = len(cardPoints) - k
4        minSubArraySum = float('inf')
5        j = curr = 0
6        
7        for i, v in enumerate(cardPoints):
8            curr += v
9            if i - j + 1 > size:
10                curr -= cardPoints[j]
11                j += 1
12            if i - j + 1 == size:    
13                minSubArraySum = min(minSubArraySum, curr)
14				
15        return sum(cardPoints) - minSubArraySum