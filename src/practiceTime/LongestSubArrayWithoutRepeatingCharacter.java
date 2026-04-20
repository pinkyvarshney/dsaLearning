package practiceTime;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcdabbcgjr";

        Map<Character, Integer> mp = new HashMap<>();
        int maxLength = 0;

        int i = 0, j = 0;

        while (j < str.length()) {
            char ch = str.charAt(j);

            if (mp.containsKey(ch) && mp.get(ch) >= i) {
                i = mp.get(ch) + 1;
            }

            maxLength = Math.max(maxLength, j - i + 1);
            mp.put(ch, j);
            j++;
        }

        System.out.println(maxLength);
    }
}
