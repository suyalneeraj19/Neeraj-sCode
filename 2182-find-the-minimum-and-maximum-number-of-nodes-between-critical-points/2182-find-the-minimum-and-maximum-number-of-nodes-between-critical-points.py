# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        first, last, prev_val = float('inf'), 0, head.val
        min_d = float('inf')
        
        i = 0
        while head.next:
            if (max(prev_val, head.next.val) < head.val) or (min(prev_val, head.next.val) > head.val):
                if last != 0:
                    min_d = min(min_d, i - last)
                first = min(first, i)
                last = i
            prev_val = head.val
            head = head.next
            i += 1
        
        if min_d == float('inf') or first == last:
            return [-1, -1]
        return [min_d, last - first]
        