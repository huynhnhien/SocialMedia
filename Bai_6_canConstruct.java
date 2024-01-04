public class Bai_6_canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26]; // Assuming lowercase English letters only

        // Count the frequencies of characters in the magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check if the ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false; // A required character is missing
            }
            charCount[c - 'a']--;
        }

        return true; // All cha
    }
}
