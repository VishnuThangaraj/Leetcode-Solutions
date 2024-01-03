# https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

# https://leetcode.com/problems/number-of-laser-beams-in-a-bank/solutions/4495310/on-java-python-javascript-linear-solution/

class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        total, previousLasers = 0, 0

        for row in bank:
            current = row.count("1")

            # continue if No lasers found in the current Row
            if current == 0: 
                continue

            total += previousLasers * current
            previousLasers = current

        return total
