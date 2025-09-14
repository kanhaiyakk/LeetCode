class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
      Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();
        
        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            vowelInsensitive.putIfAbsent(devowel(lower), word);
        }
        
        String[] result = new String[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            
            if (exactWords.contains(query)) {
                result[i] = query;
            } else {
                String lower = query.toLowerCase();
                if (caseInsensitive.containsKey(lower)) {
                    result[i] = caseInsensitive.get(lower);
                } else {
                    String devowel = devowel(lower);
                    result[i] = vowelInsensitive.getOrDefault(devowel, "");
                }
            }
        }
        
        return result;
    }
    
    private String devowel(String word) {
        return word.replaceAll("[aeiou]", "*");
    }  
    
}