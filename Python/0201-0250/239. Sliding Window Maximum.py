# https://leetcode.com/problems/sliding-window-maximum/

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        size, result, storage = len(nums), [], []

        # Add K length elements to Dequeue
        for index in range(0, k):
            while len(storage) > 0 and nums[index] >= nums[storage[len(storage)-1]]:
                storage.pop()
            storage.append(index)

        # Sliding Window
        for index in range(k, size):
            result.append(nums[storage[0]])

            # Remove Elements out of the window range
            while len(storage) > 0 and storage[0] < index-k+1:
                storage.pop(0)

            # Remove Smaller Elements than the current num form the End of Deque
            while len(storage) > 0 and nums[index] >= nums[storage[len(storage)-1]]:
                storage.pop()
            
            storage.append(index)

        result.append(nums[storage[0]])
        return result
