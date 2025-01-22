import java.util.HashMap;
import java.util.Map;

  public class FirstUniqueCharacter {

    public static int firstUniqueChar(String s) {
      // Step 1: Count character frequencies
      Map<Character, Integer> map = new HashMap<>();
      for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
      }

      // Step 2: Find the first non-repeating character
      for (int i = 0; i < s.length(); i++) {
        if (map.get(s.charAt(i)) == 1) {
          return i;
        }
      }

      return -1;
    }

    public static void main(String[] args) {
      System.out.println(firstUniqueChar("saverio"));   // Output: 0
      System.out.println(firstUniqueChar("saverios"));   // Output: 1
      System.out.println(firstUniqueChar("aabb"));      // Output: -1
    }
  }

