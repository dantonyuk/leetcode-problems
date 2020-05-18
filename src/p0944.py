# https://leetcode.com/problems/delete-columns-to-make-sorted
class Solution:
    def minDeletionSize(self, A: List[str]) -> int:
        return sum(1 for xs in zip(*A) if any(x > y for (x, y) in zip(xs, xs[1:])))

# Another solution:
# class Solution:
#     def minDeletionSize(self, A: List[str]) -> int:
#         def decreasing(xs):
#             return bool([1 for (x,y) in zip(xs, xs[1:]) if x > y])
#         return len([1 for xs in zip(*A) if decreasing(xs)])
