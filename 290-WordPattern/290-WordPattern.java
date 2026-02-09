// Last updated: 09/02/2026, 13:33:52
    class Solution {
    public boolean wordPattern(String distinct, String s) {
        String[] words = s.split(" ");
        if (distinct.length() != words.length) {
            return false;}
        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> seenWords = new HashSet<>();
        for (int i = 0; i < distinct.length(); i++) {
            char c = distinct.charAt(i);
            String w = words[i];
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;}
            } else {
                if (seenWords.contains(w)) {
                    return false;}
                charToWord.put(c, w);
                seenWords.add(w);}}
        return true;
    }}
