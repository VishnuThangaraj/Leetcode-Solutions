class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        expected = [x for x in heights]
        expected.sort()

        difference = 0

        for i in range(len(heights)):
            if expected[i] != heights[i]:
                difference += 1

        return difference
