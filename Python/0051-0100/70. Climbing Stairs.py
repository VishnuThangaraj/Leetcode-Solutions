# https://leetcode.com/problems/climbing-stairs/

# https://leetcode.com/problems/climbing-stairs/solutions/4584499/o-n-o-1-java-python-javascript-typescript-c-c-fibonacci-method/

class Solution:
    def climbStairs(self, n: int) -> int:
        # If the N is less than 2 | No.of ways to reach will be N.
        if n<=2:
            return n

        # Initialize variables to keep track of previous two steps.
        prev, B_prev = 1, 2
        # Current Step Count based on previous Two steps.
        current = 0

        for loop in range(1,n-1):
            current = prev + B_prev # Calculate current steps
            # Update previous steps for next iteration
            prev = B_prev
            B_prev = current

        return current
