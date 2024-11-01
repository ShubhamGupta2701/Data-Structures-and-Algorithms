import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfLetterInString {
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Map to store the frequency of each character
        Map<Character, Integer> freq = new HashMap<>();

        // Populate the frequency map
        for (char item : line.toCharArray()) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        // Variables to track the maximum frequency and the corresponding character
        char maxChar = line.charAt(0);
        int maxFreq = 0;

        // Find the character with the highest frequency
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq || (entry.getValue() == maxFreq && entry.getKey() < maxChar)) {
                maxChar = entry.getKey();
                maxFreq = entry.getValue();
            }
        }
        return maxChar;
    }    
}

