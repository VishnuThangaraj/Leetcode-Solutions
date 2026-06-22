/*
1189. Maximum Number of Balloons
https://leetcode.com/problems/maximum-number-of-balloons/description/

Solution 
https://leetcode.com/problems/maximum-number-of-balloons/solutions/8351784/on-o1-java-python-javascript-typescript-sgt4a/
*/

function maxNumberOfBalloons(text: string): number {
    // Store required character counts
    const freq = new Map<string, number>([
        ['b', 0],
        ['a', 0],
        ['l', 0],
        ['o', 0],
        ['n', 0]
    ]);

    // Count occurrences
    for (const letter of text) {
        if (freq.has(letter)) {
            freq.set(letter, freq.get(letter)! + 1);
        }
    }

    let result: number = text.length;

    // Find limiting character
    for (let [key, value] of freq) {
        if (key === 'l' || key === 'o') {
            value = Math.floor(value / 2); // Needed twice
        }

        result = Math.min(result, value);
    }

    return result;
}