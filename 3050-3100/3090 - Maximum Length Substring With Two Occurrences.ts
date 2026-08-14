/*
3090. Maximum Length Substring With Two Occurrences
https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/

Solution
https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/solutions/8459709/maximum-length-substring-with-at-most-tw-xtft/
*/

function maximumLengthSubstring(s: string): number {
    let result: number = 0;
    let start: number = 0;

    const storage: Map<string, number> = new Map();

    for (let end = 0; end < s.length; end++) {
        storage.set(
            s[end],
            (storage.get(s[end]) || 0) + 1
        );

        // Shrink window if frequency exceeds 2
        while (storage.get(s[end])! > 2) {
            storage.set(
                s[start],
                storage.get(s[start])! - 1
            );
            start++;
        }

        result = Math.max(result, end - start + 1);
    }

    return result;
}
