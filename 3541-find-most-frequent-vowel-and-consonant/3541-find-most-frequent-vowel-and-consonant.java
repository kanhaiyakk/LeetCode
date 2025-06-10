class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxVowel = 0;
        int maxConsonant = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (vowels.contains(ch)) {
                maxVowel = Math.max(maxVowel, freq);
            } else {
                maxConsonant = Math.max(maxConsonant, freq);
            }
        }

        return maxVowel + maxConsonant;
    }
}