import java.util.HashSet;

public class LongestSubstringWOReps {

  public static int lengthOfLongestSubstringWOReps(String s) {
    int maxLength = 0;
    int start = 0;
    HashSet<Character> set = new HashSet<>();

    for (int end = 0; end < s.length(); end++) {
      while (set.contains(s.charAt(end))) {
        set.remove(s.charAt(start));
        start++;
      }
      set.add(s.charAt(end));
      maxLength = Math.max(maxLength, end - start + 1);
    }

    return maxLength;
  }

  public static void main(String[] args) {
    String input = "abcabcbbdef";
    System.out.println("Length of the longest substring: " + lengthOfLongestSubstringWOReps(input));
  }
}
